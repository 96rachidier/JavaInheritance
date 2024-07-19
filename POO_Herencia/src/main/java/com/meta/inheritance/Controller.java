package com.meta.inheritance;

import java.util.Random;

public class Controller extends OculusControllers {

    public Controller(String productModel, String commercialName, String serialNumber) {
        super(productModel, commercialName, serialNumber);
    }

    @Override
    boolean unpair() {
        System.out.println("Unpairing Left Controller");
        System.out.println("Unpairing Right Controller");
        return new Random().nextInt(99) > 30;
    }

    boolean pairLeft() {
        System.out.println("Pairing Left Controller" + " " + getCommercialName());
        return new Random().nextInt(99) > 30;
    }

    boolean pairRight() {
        System.out.println("Pairing Right Controller" + " " + getCommercialName());
        return new Random().nextInt(99) > 30;
    }

    boolean pairSingle() {
        System.out.println("Pairing single controller" + " " + getCommercialName());
        return new Random().nextInt(99) > 30;
    }

    @Override
    boolean unpairSingle() {
        System.out.println("Info: Unpairing Controllers...");
        return new Random().nextInt(99) > 30;
    }

    public static void resetAndPairControllers(OculusControllers controller, OculusControllers controller1) {
        System.out.println("Info: Unpairing Controllers...");

        // Desemparejar los controladores
        boolean unpairSuccess = controller.unpair();
        if (!unpairSuccess) {
            System.out.println("Error: Failed to unpair controllers");
            return;
        }
        System.out.println("Info: Controllers unpaired successfully!");

        // Emparejar los controladores
        boolean pairSuccess = controller.pairLeft();
        if (!pairSuccess) {
            System.out.println("Error: Failed to pair Left controller");
            return;
        }
        boolean pairSuccess1 = controller1.pairRight();
        if (!pairSuccess1) {
            System.out.println("Error: Failed to pair right controller");
            return;
        }
        System.out.println("Info: Controllers paired successfully!");
    }
}
