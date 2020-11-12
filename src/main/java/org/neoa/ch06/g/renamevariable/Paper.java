package org.neoa.ch06.g.renamevariable;

public class Paper {

    private String _title = "untitled";

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        this._title = title;
    }

    public String getFormattedHeader() {
        return "<h1>" + getTitle() + "</h1>";
    }

    public void extractTitle(String text) {
        String [] words = text.split(",");
        setTitle(words[0]);
    }
}
