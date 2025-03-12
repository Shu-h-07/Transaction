package org.example.transaction.service;

import org.example.transaction.dto.KartaDto;
import org.example.transaction.model.Karta;
import org.example.transaction.model.Result;
import org.example.transaction.repository.KartaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KartaService {
    @Autowired
    KartaRepo kartaRepo;

    public List<Karta> findAll() {
        return kartaRepo.findAll();
    }

    public Karta findById(int id) {
        Optional<Karta> byId = kartaRepo.findById(id);
        return byId.get();
    }

    public Result create(KartaDto kartaDto) {
        Karta karta = new Karta();
        karta.setName(kartaDto.getName());
        karta.setPassword(kartaDto.getPassword());
        karta.setNumber(kartaDto.getNumber());
        karta.setExpireDate(kartaDto.getExpireDate());
        kartaRepo.save(karta);
        return new Result(true, "Yaratildi");
    }

    public Result update(Integer id, KartaDto kartaDto) {
        Optional<Karta> byId = kartaRepo.findById(id);
        if (byId.isPresent()) {

            Karta karta = byId.get();
            karta.setName(kartaDto.getName());
            karta.setPassword(kartaDto.getPassword());
            karta.setNumber(kartaDto.getNumber());
            karta.setExpireDate(kartaDto.getExpireDate());
            kartaRepo.save(karta);
            return new Result(true, "Yangilandi");

        }
        return new Result(true,"Topilmadi");
    }
    public Result delete(Integer id) {
        kartaRepo.deleteById(id);
        return new Result(true, "O'chirildi");
    }

}
