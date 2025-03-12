package org.example.transaction.service;

import org.example.transaction.dto.OtkazmalarDto;
import org.example.transaction.model.Otkazmalar;
import org.example.transaction.model.Result;
import org.example.transaction.repository.OtkazmalarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OtkazmalarService {
    @Autowired
    OtkazmalarRepo otkazmalarRepo;

    public List<Otkazmalar> findAll() {
        return otkazmalarRepo.findAll();
    }

    public Otkazmalar findById(int id) {
        Optional<Otkazmalar> byId = otkazmalarRepo.findById(id);
        return byId.get();
    }
    public Result save(OtkazmalarDto otkazmalarDto){
        Otkazmalar otkazmalar = new Otkazmalar();
        otkazmalar.setDescription(otkazmalar.getDescription());
        return new Result(true , "save");
    }
}
