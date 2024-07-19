package com.meta.inheritance;

abstract public class Wearables extends MetaProducts {

    private int availableColors;

    public Wearables(String productModel, String commercialName, String serialNumber){
        super (productModel, commercialName, serialNumber);
    }

    abstract boolean glassesCaseName();

    public int getAvailableColors() {
        return availableColors;
    }
    public void setAvailableColors(int availableColors) {

        this.availableColors = availableColors;
    }
}
