package com.meta.inheritance;

public class Terry extends Portal{
    public Terry(String serialNumber) {
        super("Ohana", "Portal Generation", serialNumber);
    }
    @Override
    boolean battery() {
        System.out.println("Terry has battery!");
        return true;
    }
}
