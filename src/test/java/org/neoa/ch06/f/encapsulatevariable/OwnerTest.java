package org.neoa.ch06.f.encapsulatevariable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OwnerTest {

    private Owner owner;

    @BeforeEach
    void setup() {
        this.owner = new Owner();
    }

    @Test
    void setOwnerPropertiesFinishedSuccessful() {
        this.owner.firstName = "Martin";
        this.owner.lastName = "Fowler";

        assertThat(owner.firstName).isEqualTo("Martin");
        assertThat(owner.lastName).isEqualTo("Fowler");
    }

}
