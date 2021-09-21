package com.company;

public class Petter extends Papa implements Printable{

    private String suport;

    @Override
    public void print() {
        System.out.println(getName() +"\n"+ getAge() +"\n"+ suport);
    }

    public Petter(int age, String name, String suport) {
        super(age, name);
        this.suport = suport;
    }
}
