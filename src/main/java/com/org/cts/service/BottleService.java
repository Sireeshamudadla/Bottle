package com.org.cts.service;

import com.org.cts.model.Bottle;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BottleService {
    public void createBottle(Bottle bottle);
    public void updateBottle( Bottle bottle);
    public List<Bottle> getAllBottles();
    public String deleteById( Integer id);
    public Bottle getById(Integer id);

}
