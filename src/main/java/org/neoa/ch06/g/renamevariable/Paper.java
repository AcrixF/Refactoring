package org.neoa.ch06.g.renamevariable;

public class Paper {

    private String tpHd = "untitled";

    public String getTitle() {
        return tpHd;
    }

    public void setTitle(String title) {
        this.tpHd = title;
    }

    public String getFormattedHeader() {
        return "<h1>" + getTitle() + "</h1>";
    }

    public void extractTitle(String text) {
        String [] words = text.split(",");
        setTitle(words[0]);
    }
}
