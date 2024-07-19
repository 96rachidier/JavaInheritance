package com.meta.inheritance;

public class Ohana extends Portal{
    public Ohana(String serialNumber) {
        super("Ohana", "Portal Generation", serialNumber);
    }
    @Override
    boolean battery() {
        System.out.println("Ohana not has battery!");
        return true;
    }
}
