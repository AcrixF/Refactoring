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
        this.owner.setFirstName("Martin");
        this.owner.setLastName("Fowler");

        assertThat(owner.getFirstName()).isEqualTo("Martin");
        assertThat(owner.getLastName()).isEqualTo("Fowler");
    }

}
