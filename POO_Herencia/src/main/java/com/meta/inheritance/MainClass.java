package com.meta.inheritance;

//instancia = creación de un objeto en memoria
//no puedo crear instancias de una abstract class, pero si objetos
public class MainClass {
    public static void main(String[] args) {
        classIdentify();
    }

    public static void classIdentify() {

        MetaProducts object = new Quest2("12MH22OA");
        Oculus hollywood = (Oculus) object;
        Quest2 otherPointer = (Quest2) hollywood;
        System.out.println(hollywood.getSerialNumber() + " This is the hollywood object");
        System.out.println(object.getSerialNumber() + " This is the object Oculus");
        System.out.println(otherPointer.getSerialNumber() + " This is the object Quest");
        object.printMainClass();
        hollywood.printMainClass();
        otherPointer.printMainClass();
        System.out.println(" ");
        hollywood.libertyScales();
        otherPointer.libertyScales(); //los métodos de las clases hijas no pueden ser llamados por las clases padre

        /* instanceof*/

        System.out.println(hollywood instanceof Oculus); // output true

        if (hollywood instanceof Oculus) {
            System.out.println("Hollywood is an instance of Oculus");
        } else {
            System.out.println("Not is an instance of Oculus");
        }

        if (hollywood instanceof Quest) {
            System.out.println("Hollywood is an instance of MetaProducts");
        } else {
            System.out.println("Hollywood not is an instance of Quest");
        }

        if (object instanceof MetaProducts) {
            System.out.println("object is an instance of MetaProducts");
        } else {
            System.out.println("object not is an instance of MetaProducts");
        }

        if (otherPointer instanceof MetaProducts) {
            System.out.println("otherPointer is an instance of MetaProducts");
        } else {
            System.out.println("otherPointer not is an instance of MetaProducts");
        }

//investigar instanceOF

    }

    public static void exerciseIsa() {

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
