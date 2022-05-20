package com.org.cts.service;

import com.org.cts.model.Bottle;
import com.org.cts.repository.BottleRepo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BottleServiceImpl implements BottleService {
    @Autowired
    BottleRepo bottleRepo;

    @Override
    public void createBottle(Bottle bottle) {
        bottleRepo.save(bottle);
    }

    @Override
    public void updateBottle(Bottle bottle) {
        bottleRepo.save(bottle);
    }

    @Override
    public List<Bottle> getAllBottles() {
        List<Bottle> bottle = bottleRepo.findAll();
        return bottle;
    }

    @Override
    public String deleteById(Integer id) {
        bottleRepo.deleteById(id);
        return "success";
    }

    @Override
    public Bottle getById(Integer id) {
        Bottle bottle=  bottleRepo.getById(id);
        return bottle;
    }

}



