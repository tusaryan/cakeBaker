package com.example.tus.week1Homework.cakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class Frosting {
    @Autowired
    private GetFrosting getfrost;

    String getFrostingType() {
        return getfrost.getFrostingType();

    }
}
