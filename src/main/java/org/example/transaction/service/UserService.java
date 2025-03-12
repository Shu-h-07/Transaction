package org.example.transaction.service;

import org.example.transaction.dto.UserDto;
import org.example.transaction.model.Result;
import org.example.transaction.model.User;
import org.example.transaction.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> findAll() {
       return userRepo.findAll();
    }
    public User findById(int id) {
        Optional<User> byId = userRepo.findById(id);
        return byId.get();
    }
    public Result create(UserDto userDto){
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setSurname(userDto.getSurname());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setEmail(userDto.getEmail());
        userRepo.save(user);
        return new Result(true , "E malades");
    }
    public Result update(Integer id, UserDto userDto){
        Optional<User> byId = userRepo.findById(id);
        if (byId.isPresent()) {
            User user = byId.get();
            user.setUsername(userDto.getUsername());
            user.setSurname(userDto.getSurname());
            user.setPhoneNumber(userDto.getPhoneNumber());
            user.setEmail(userDto.getEmail());
            userRepo.save(user);
            return new Result(true , "Xoxishiz");
        }
        return new Result(false, "Unaqa masda");
    }
    public Result delete(Integer id){
        userRepo.deleteById(id);
        return new Result(true , "Oziz bilasiz");
    }
}
