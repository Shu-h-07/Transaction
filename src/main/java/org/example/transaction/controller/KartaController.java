package org.example.transaction.controller;

import org.example.transaction.dto.KartaDto;
import org.example.transaction.model.Karta;
import org.example.transaction.model.Result;
import org.example.transaction.service.KartaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/karta")
public class KartaController {
    @Autowired
    KartaService kartaService;


    @GetMapping
    public List<Karta> findAll(){
        return kartaService.findAll();
    }
    @GetMapping
    public Karta findById(Integer id){
        Karta byId = kartaService.findById(id);
        return byId;
    }
    @PostMapping
    public Result create(@RequestBody KartaDto kartaDto){
        Result result = kartaService.create(kartaDto);
        return result;
    }
    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody KartaDto dto){
        Result update = kartaService.update(id, dto);
        return update;

    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = kartaService.delete(id);
        return delete;
    }
}
