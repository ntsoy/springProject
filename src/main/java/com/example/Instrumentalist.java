package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrumentalist implements Performer{
    public Instrumentalist(){
    }


    @Override
    public void perform() {
        /*for (String city : this.city) {
            System.out.println(city);
        }*/
        //System.out.println(this.city.getName());
        System.out.println("Age is " + this.age);
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song){

        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong(){
        return song;
    }

    private Instrument instrument;

    private int age;

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    @Autowired
    @Qualifier("gg")
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    private String[] city;

    public void setCity(String[] city) {
        this.city = city;
    }
}
