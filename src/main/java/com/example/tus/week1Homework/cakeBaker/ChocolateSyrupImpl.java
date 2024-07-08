package com.example.tus.week1Homework.cakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type", havingValue = "chocolate")
public class ChocolateSyrupImpl implements GetSyrup{
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
