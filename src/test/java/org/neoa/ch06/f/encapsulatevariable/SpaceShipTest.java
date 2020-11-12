package org.neoa.ch06.f.encapsulatevariable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpaceShipTest {

    private SpaceShip spaceShip;

    @BeforeEach
    void setup() {
        Owner owner = new Owner().setFirstName("Tanya").setLastName("Hernandez");
        spaceShip = new SpaceShip();
        spaceShip.setDefault(owner);
    }

    @Test
    void setDefaultValuesToSpaceShip() {
        SpaceShip spaceShip_ = new SpaceShip();
        spaceShip_.setDefault(spaceShip.getDefaultOwner());

        assertThat(spaceShip_.getDefaultOwner().getFirstName()).isEqualTo(spaceShip.getDefaultOwner().getFirstName());
        assertThat(spaceShip_.getDefaultOwner().getLastName()).isEqualTo(spaceShip.getDefaultOwner().getLastName());
    }

    @Test
    void setDefaultValuesControlTheVariableValue() {
        Owner ownerOne = spaceShip.getDefaultOwner();
        ownerOne.setLastName("Juarez");
        Owner ownerTwo = spaceShip.getDefaultOwner();
        ownerTwo.setFirstName("Andrea");

        assertThat(spaceShip.getDefaultOwner().getFirstName()).isNotEqualTo("Andrea");
        assertThat(spaceShip.getDefaultOwner().getLastName()).isNotEqualTo("Juarez");
    }
}
