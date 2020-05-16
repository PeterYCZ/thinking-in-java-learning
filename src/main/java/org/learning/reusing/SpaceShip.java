package org.learning.reusing;

public class SpaceShip extends SpaceShipControls {

    private String name;
    public SpaceShip(String name){
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args){
        SpaceShip pritector = new SpaceShip("NSEA Protector");
        pritector.forward(100);
    }
}
