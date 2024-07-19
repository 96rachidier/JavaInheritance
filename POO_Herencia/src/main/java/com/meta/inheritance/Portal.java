package com.meta.inheritance;

abstract public class Portal extends MetaProducts {

    private int availableColors;

    public Portal(String productModel, String commercialName, String serialNumber) {
        super(productModel, commercialName, serialNumber);
    }

    abstract boolean battery();
    public int getAvailableColors() {
        return availableColors;
    }
    public void setAvailableColors(int availableColors) {
        this.availableColors = availableColors;
    }
}