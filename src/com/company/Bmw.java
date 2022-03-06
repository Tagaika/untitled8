package com.company;

public class Bmw extends Car implements Printable {
    private int engine;

    public Bmw(int engine) {
        this.engine = engine;
    }

    @Override
    public void print() {
        System.out.println(engine);
    }
}
