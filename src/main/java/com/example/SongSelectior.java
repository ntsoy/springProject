package com.example;


import java.util.Random;

public class SongSelectior {
    private String[] song = {"First", "Second", "Third"};

    public String getSong() {
        Random random = new Random();
        int i = random.nextInt(2);
        return song[i];
    }
}
