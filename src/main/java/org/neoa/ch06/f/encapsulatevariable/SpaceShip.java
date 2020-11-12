package org.neoa.ch06.f.encapsulatevariable;

public class SpaceShip {
    public Owner owner;

    public void setDefault(Owner owner) {
        this.owner = owner;
    }

    public Owner getDefaultOwner() {
        return owner;
    }
}
