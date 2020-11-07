package org.neoa.ch01;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = { "playID" })
public class Performance {
    private String playID;
    private int audience;

    public String getPlayID() {
        return playID;
    }

    public void setPlayID(String playID) {
        this.playID = playID;
    }

    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }
}
