package com.company;

public class Sun extends Papa implements  Printable{
    private String hobby;

    public Sun(int age, String name,String hobby) {
        super(age, name);
        this.hobby = hobby;
    }

    @Override
    public void print() {
        System.out.println(getName() + getAge() + hobby);


    }
}
