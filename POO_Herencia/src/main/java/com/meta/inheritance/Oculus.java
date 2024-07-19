package com.meta.inheritance;

abstract public class Oculus extends MetaProducts { //Generalización

    private int availableColors;
    private OculusControllers LeftController;
    private OculusControllers RightController;
    private OculusControllers ControllerSingle;
    private String installedApk;
    private boolean rootDevice;

    public Oculus(String productModel, String commercialName, String serialNumber) {
        super(productModel, commercialName, serialNumber);
    }

    @Override //método que sobrescribe al del padre. Es un aviso para el desarrollador y el compilador
    public void setProductModel(String productModel) {
        super.setProductModel(productModel + " Santi ");
    }

    public int getAvailableColors() {
        return availableColors;
    }

    public void setAvailableColors(int availableColors) {
        this.availableColors = availableColors;
    }

    public OculusControllers getLeftController() {
        return LeftController;
    }

    public void setLeftController(OculusControllers controller) {
        LeftController = controller;
    }

    public OculusControllers getRightController() {
        return RightController;
    }

    public void setRightController(OculusControllers controller) {
        RightController = controller;
    }

    public OculusControllers getControllerSingle() {
        return ControllerSingle;
    }

    public void setControllerSingle(OculusControllers controller) {

        ControllerSingle = controller;
    }

    public void printAssignedControllers() {
        if (LeftController != null) {
            System.out.println(LeftController.getCommercialName() + " " + LeftController.getSerialNumber());
        } else {
            System.out.println("Info: Left Controller no Assigned");
            return;
        }
        if (RightController != null) {
            System.out.println(RightController.getCommercialName() + " " + RightController.getSerialNumber());
        } else {
            System.out.println("Info: Right Controller no assigned");
        }
    }

    public void printSingleAssignedController() {
        if (ControllerSingle != null) {
            System.out.println(ControllerSingle.getCommercialName() + " " + ControllerSingle.getSerialNumber());
        } else {
            System.out.println("Info: Controller no assigned");
        }
    }

    public boolean isRootDevice() {
        return rootDevice;
    }

    public void setRootDevice(boolean rootDevice) {
        this.rootDevice = rootDevice;
    }

    public String getInstalledApk() {
        return installedApk;
    }

    public void setInstalledApk(String path) {
        rebootDevice();
        setRootDevice(true);
        this.installedApk = path;
        System.out.println("Info: APK: " + installedApk + " installed successfully!");
    }

    public void uninstallApk() {
        if (installedApk.isEmpty()) {
            System.out.println("Error: no apk installed");
        } else {
            System.out.println("Uninstalling: " + installedApk + "...");
            this.installedApk = "";
        }
    }
}

/* Super hace referencia a la clase padre. En cambio con this hacemos referencia a esta clase*/
