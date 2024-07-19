package com.meta.inheritance;

public class Stella extends Wearables{
    public Stella(String serialNumber) {
        super("Stella", "Ray-Ban Stories", serialNumber);
    }
    @Override
    boolean glassesCaseName() {
        System.out.println("Glasses Case Stella");
        return true;
    }
}
