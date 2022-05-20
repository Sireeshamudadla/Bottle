package com.org.cts.controller;

import com.org.cts.model.Bottle;
import com.org.cts.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BottleController {
    @Autowired
    BottleService bottleService;

    @PostMapping("/create")
    public void createBottle(@RequestBody Bottle bottle){
        bottleService.createBottle(bottle);
    }
    @PutMapping("/update")
    public void updateBottle(@RequestBody Bottle bottle) {
        bottleService.updateBottle(bottle);
    }
    @GetMapping("/getAll")
    public List<Bottle>getAllBottles(){
        List<Bottle> bottleList=    bottleService.getAllBottles();
        return bottleList;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        return "successfully";
    }
    @GetMapping("/getById/{id}")
    public Bottle getById(@PathVariable Integer id){
        Bottle bottle= bottleService.getById(id);
        return bottle;
    }
}
