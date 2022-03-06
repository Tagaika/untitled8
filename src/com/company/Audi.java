package com.company;

public class Audi extends Car implements Printable{
    private int  power;

    public Audi(int power) {
        this.power = power;
    }

    @Override
    public void print() {
        System.out.println(power);

    }
}
