package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("mercedez").print();
        createObject("bmw").print();
        createObject("audi").print();
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "mercedez" -> {
                Mercedez mercedez = new Mercedez(4);
                return mercedez;
            }
            case "bmw" -> {
                Bmw bmw = new Bmw(3);
                return bmw;
            }
            case "audi" -> {
                Audi audi = new Audi(25000);
                return audi;
            }
        }

        return new Mercedez(8);
    }
}
