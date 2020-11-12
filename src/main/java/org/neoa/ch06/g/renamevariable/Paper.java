package org.neoa.ch06.g.renamevariable;

public class Paper {

    private String tpHd = "untitled";

    public String getFormattedHeader() {
        return "<h1>" + tpHd + "</h1>";
    }

    public void updateHeader(String header) {
        this.tpHd = header;
    }

}
