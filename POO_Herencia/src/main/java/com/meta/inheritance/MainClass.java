package com.meta.inheritance;

public class MainClass {
    public static void main(String[] args) {

        Oculus oculusQuest = new Quest("1PSH29443N"); //transformo de clase (código fuente) a objeto (run time)
        OculusControllers controller = new Controller("LCON", "Left LCON", "1234");
        OculusControllers controller1 = new Controller("LCON", "Right LCON", "12345");
        oculusQuest.setLeftController(controller);
        oculusQuest.setRightController(controller1);
        oculusPrintName(oculusQuest, true);
        Controller.resetAndPairControllers(controller, controller1);
        oculusQuest.setFastbootMode();
        System.out.println("Info: Device detected in " + oculusQuest.getDeveloperMode() + " mode ");
        reboot(oculusQuest);
        oculusQuest.setVolume(70);
        System.out.println("Volume: " + oculusQuest.getVolume());

        System.out.println(" ");
        System.out.println("Info: Installing APK...");
        oculusQuest.setInstalledApk("com.facebook.hwtp.utilities.cts");
        System.out.println("Current APK: " + oculusQuest.getInstalledApk());
        oculusQuest.uninstallApk();
        System.out.println("APK uninstalled successfully!");

        Oculus oculusGo = new Pacific("123ASDS");
        OculusControllers controllerGo = new Controller("Go Controller", "Oculus Go Controller", "231KSADJ");
        oculusGo.setControllerSingle(controllerGo);
        oculusPrintName(oculusGo, false);
        resetSingleControllers(controllerGo);
        oculusGo.setADBMode();
        System.out.println("Info: Device detected in " + oculusGo.getDeveloperMode() + " mode ");
        reboot(oculusGo);

        Oculus oculusQuest2 = new Quest2("1WMHH1238573");
        OculusControllers controller2 = new Controller("Rainer", "Left Rainer", "123412");
        OculusControllers controller3 = new Controller("Rainer", "Right Rainer", "12345213");
        oculusQuest2.setLeftController(controller2);
        oculusQuest2.setRightController(controller3);
        oculusPrintName(oculusQuest2, true);
        Controller.resetAndPairControllers(controller2, controller3);
        oculusQuest2.setFastbootMode();
        System.out.println("Info: Device detected in " + oculusQuest2.getDeveloperMode() + " mode ");
        reboot(oculusQuest2);

    }

    public static boolean resetSingleControllers(OculusControllers controller) { //Polimorfismo
        return controller.resetSingleControllers();
    }

    public static Boolean glassesCaseName(Wearables wearables) {
        return wearables.glassesCaseName();
    }

    public static boolean battery(Portal portal) { //Tipo + nombre

        return portal.battery();
    }

    public static void oculusPrintName(Oculus product, boolean pairControllers) {
        System.out.println(" ");
        System.out.println(" -------------------------- ");
        System.out.println("Info: Starting Execution... ");
        System.out.println("Info: Device detected: " + product.getProductModel() + " " + product.getSerialNumber());
        System.out.println("Info: Assigned controllers: ");
        if (pairControllers) {
            product.printAssignedControllers();
        } else {
            product.printSingleAssignedController();
        }
        System.out.println(" ");
    }
    public static void reboot(MetaProducts product) {
        product.rebootDevice();
        System.out.println("Info: Device in " + product.getDeveloperMode() + " mode");
    }
}

//TO DO jerarquia de clases para los portal y wearables
//pensar otros métodos polimórficos

//cualquier cosa que yo declare con protected no voy a poder acceder desde otro paquete
//private significa que no se puede heredar
//buscar la palabra super y resolver el mismo problema
//ctrl + Y delete complete line
//Interfaz: definen comportamiento, no implementaciones
