package fr.tests.models;

import fr.tests.interfaces.IFlyingObject;

public class Plane implements IFlyingObject {
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("I am flying with my motor");
    }
}
