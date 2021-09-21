package com.company;

public class Doch extends Papa implements Printable{
    private String playing;

    public Doch(int age, String name, String playing) {
        super(age, name);
        this.playing = playing;

    }

    @Override
    public void print() {
        System.out.println(getName() + getAge() + playing);


    }
}
