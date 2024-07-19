package com.meta.inheritance;
abstract public class OculusControllers extends MetaProducts {
    public OculusControllers(String productModel, String commercialName, String serialNumber) {
        super(productModel, commercialName, serialNumber);
    }
    abstract boolean pairLeft();
    abstract boolean pairRight();
    abstract boolean unpair();
    abstract boolean pairSingle();
    abstract boolean unpairSingle();

    //complejidad ciclomática
    public boolean resetSingleControllers() { //método template

        if (!unpairSingle()) {
            System.out.println("Error: controller cannot be unpaired");
            return false; //early return
        }
        System.out.println("Info: Controller unpaired successfully!");

        if (!pairSingle()) {
            System.out.println("Error: controller cannot be paired");
            return false;
        }
        System.out.println("Info: Controller paired successfully!");
        return true;
    }

}