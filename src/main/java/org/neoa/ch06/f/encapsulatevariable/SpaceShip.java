package org.neoa.ch06.f.encapsulatevariable;

public class SpaceShip {
    public Owner owner;

    public void setDefault(Owner owner) {
        this.owner = owner;
    }

    public Owner getDefaultOwner() {
        Owner owner = new Owner();
        owner.setFirstName(this.owner.getFirstName());
        owner.setLastName(this.owner.getLastName());
        return owner;
    }
}
