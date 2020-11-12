package org.neoa.ch06.g.renamevariable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PaperTest {

    private Paper paper;

    @BeforeEach
    void setup() {
        paper = new Paper();
    }

    @Test
    void getFormattedHeaderReturnsExpected() {
        String result = paper.getFormattedHeader();
        assertThat(result).isNotNull();
    }

    @Test
    void extractTitleSetTitleValueCorrectly() {
        String text = "BigFoot found in Mexico, the mythical creature";

        paper.extractTitle(text);

        String header = paper.getTitle();

        assertThat(header).isEqualTo("BigFoot found in Mexico");

    }
}
