package com.example.tus.week1Homework.cakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Syrup {
    @Autowired
    private GetSyrup getsyrup;

    String getSyrupType() {
        return getsyrup.getSyrupType();
    }
}
