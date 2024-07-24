package com.meta.inheritance;

abstract class MetaProducts {
    // private String productModel;
    private int storage, ram, releasedYear, volume;
    private String productModel, commercialName, serialNumber, developerMode;

    public MetaProducts(String productModel, String commercialName, String serialNumber) { //parte pública del método
        this.productModel = productModel; //atributos mandatorios
        this.commercialName = commercialName;
        this.serialNumber = serialNumber;
    }
    public  void printMainClass(){
        System.out.println("I was called from MetaProducts");
    }
    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    protected void print() {
        System.out.println("Eder");
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setFastbootMode() {
        developerMode = "Fastboot";
    }

    public void setADBMode() {
        developerMode = "Adb";
    }

    public String getDeveloperMode() {
        return developerMode;
    }


    public void rebootDevice() {
        if (developerMode.equals("Fastboot")) {
            developerMode = "Adb"; //Reboot
        } else if (developerMode.equals("Adb")) {
            developerMode = "Fastboot";
        }
        System.out.println("Info: Device rebooted successfully!");
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
            return;
        }
        if (volume < 0) {
            this.volume = 0;
            return;
        }
        this.volume = volume;
    }
}
