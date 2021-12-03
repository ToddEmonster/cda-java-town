package fr.tests;

import fr.tests.interfaces.IFlyingObject;
import fr.tests.models.Plane;

public class Main {
    public static void main(String[] args) {
        testInterface();
    }
    private static void testInterface() {
        Plane airbus380 = new Plane("Airbus");

        airbus380.fly();
        // IFlyingObject[] flyingObjectsArray = new Array(10);
    }
}
