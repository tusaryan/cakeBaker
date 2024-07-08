package com.example.tus.week1Homework.cakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    @Autowired
    Frosting frost;
    @Autowired
    Syrup syrup;

    String bakeCake() {
        return "Baking cake with : " + frost.getFrostingType() + " & " + syrup.getSyrupType();
    }
}
