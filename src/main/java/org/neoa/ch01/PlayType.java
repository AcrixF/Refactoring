package org.neoa.ch01;

public enum PlayType {
    TRAGEDY("tragedy"),
    COMEDY("comedy");

    String type;
    PlayType(String value) {
        this.type = value;
    }
}
