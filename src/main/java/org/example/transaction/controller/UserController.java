package org.example.transaction.controller;

import org.example.transaction.dto.UserDto;
import org.example.transaction.model.Result;
import org.example.transaction.model.User;
import org.example.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping
    public User findById(Integer id){
        User byId = userService.findById(id);
        return byId;
    }
    @PostMapping
    public Result create(@RequestBody UserDto userDto){
        Result result = userService.create(userDto);
        return result;
    }
    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody UserDto dto){
        Result update = userService.update(id, dto);
        return update;

    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = userService.delete(id);
        return delete;
    }


}
