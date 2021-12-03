package fr.tests.models;

import fr.tests.interfaces.IFlyingObject;

public class Duck implements IFlyingObject {
    public void fly() {
        System.out.println("I am with my feathers");
    }
}
