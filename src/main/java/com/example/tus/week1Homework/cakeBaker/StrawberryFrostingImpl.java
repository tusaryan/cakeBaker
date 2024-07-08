package com.example.tus.week1Homework.cakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type", havingValue = "strawberry")
public class StrawberryFrostingImpl implements GetFrosting {
     public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
