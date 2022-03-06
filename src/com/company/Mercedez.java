package com.company;

public class Mercedez extends Car implements Printable{
    private int wheel;

    public Mercedez(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public void print() {
        System.out.println(wheel);

    }

}
