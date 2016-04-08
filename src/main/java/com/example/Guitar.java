package com.example;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("gg")
public class Guitar implements Instrument {
    @Override
    public void play(){
        System.out.println("DZIN DZIN DZIN");
    }
}
