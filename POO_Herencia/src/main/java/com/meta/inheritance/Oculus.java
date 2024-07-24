package com.meta.inheritance;

abstract public class Oculus extends MetaProducts { //Generalización

    private int availableColors;
    private OculusControllers leftController; //usar minúsuculas para nombre de los objetos
    private OculusControllers rightController;
    private OculusControllers controllerSingle;
    private String installedApk;
    private boolean rootDevice;

    public Oculus(String productModel, String commercialName, String serialNumber) {
        super(productModel, commercialName, serialNumber);
    }

    public void libertyScales(){
        System.out.println("There are the liberty scales of the oculus devices");
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
        return leftController;
    }

    public void setLeftController(OculusControllers controller) {
        leftController = controller;
    }

    public OculusControllers getRightController() {
        return rightController;
    }

    public void setRightController(OculusControllers controller) {
        rightController = controller;
    }

    public OculusControllers getControllerSingle() {
        return controllerSingle;
    }

    public void setControllerSingle(OculusControllers controller) {

        controllerSingle = controller;
    }

    public void printAssignedControllers() {
        if (leftController != null) {
            System.out.println(leftController.getCommercialName() + " " + leftController.getSerialNumber());
        } else {
            System.out.println("Info: Left Controller no Assigned");
            return;
        }
        if (rightController != null) {
            System.out.println(rightController.getCommercialName() + " " + rightController.getSerialNumber());
        } else {
            System.out.println("Info: Right Controller no assigned");
        }
    }

    public void printSingleAssignedController() {
        if (controllerSingle != null) {
            System.out.println(controllerSingle.getCommercialName() + " " + controllerSingle.getSerialNumber());
        } else {
            System.out.println("Info: Controller no assigned");
        }
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
