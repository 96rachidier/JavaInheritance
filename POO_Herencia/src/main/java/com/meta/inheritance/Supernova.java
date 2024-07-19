package com.meta.inheritance;

public class Supernova extends Wearables{
    public Supernova(String serialNumber) {
        super("Supernova", "Ray-Ban Meta Smart Glasses", serialNumber);
    }
    @Override
    boolean glassesCaseName() {
        System.out.println("Rhea");
        return true;
    }
}
