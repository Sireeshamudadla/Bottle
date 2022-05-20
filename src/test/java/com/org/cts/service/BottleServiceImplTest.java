package com.org.cts.service;

import com.org.cts.model.Bottle;
import com.org.cts.repository.BottleRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BottleServiceImplTest {
    @InjectMocks
    private BottleServiceImpl BottleServiceImpl;

    @Mock
    private BottleRepo  bottleRepo;
    @Test
    void createBottle() {
        Bottle bottle =new Bottle();
        bottle.setId(100);
        bottle.setLocation("blr");
        bottle.setName("siri");
        BottleServiceImpl.createBottle(bottle);
        Mockito.verify(bottleRepo,Mockito.times(1)).save(bottle);

    }

    @Test
    void updateBottle() {
        Bottle bottle =new Bottle();
        bottle.setId(100);
        bottle.setLocation("blr");
        bottle.setName("siri");
        BottleServiceImpl.updateBottle(bottle);
        Mockito.verify(bottleRepo,Mockito.times(1)).save(bottle);
    }

    @Test
    void getAllBottles() {
        List<Bottle> list=new ArrayList<>();
        Bottle bottle=new Bottle();
        bottle.setId(100);
        bottle.setName("siri");
        bottle.setLocation("blr");
        list.add(bottle);
        Bottle bottle1=new Bottle();
        bottle1.setId(101);
        bottle1.setName("siri");
        bottle1.setLocation("blr");
        list.add(bottle1);
        Mockito.when(bottleRepo.findAll()).thenReturn(list);
        List<Bottle>list2= BottleServiceImpl.getAllBottles();
        Assertions.assertEquals(list.size(),list2.size());
    }


    @Test
    void deleteById() {
        int id=100;
        String value="success";
       String value2= BottleServiceImpl.deleteById(id);
        Assertions.assertEquals(value,value2);
      Mockito.verify(bottleRepo,Mockito.times(1)).deleteById(id);

    }

    @Test
    void getById() {
        int id=100;
        Bottle bottle=new Bottle();
        bottle.setId(100);
        bottle.setName("siri");
        bottle.setLocation("blr");
        Mockito.when( bottleRepo.getById(id)).thenReturn(bottle);
        Bottle bottle1=  BottleServiceImpl.getById(id);
        Assertions.assertEquals(bottle,bottle1);

    }
}