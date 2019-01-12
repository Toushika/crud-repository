package com.enigma.dev.request;

import java.io.Serializable;

public class TenderRequest implements Serializable {
    private String tenderRef1;
    private String tenderName1;
    private String tenderPerson1;

    public String getTenderRef1() {
        return tenderRef1;
    }

    public void setTenderRef1(String tenderRef1) {
        this.tenderRef1 = tenderRef1;
    }

    public String getTenderName1() {
        return tenderName1;
    }

    public void setTenderName1(String tenderName1) {
        this.tenderName1 = tenderName1;
    }

    public String getTenderPerson1() {
        return tenderPerson1;
    }

    public void setTenderPerson1(String tenderPerson1) {
        this.tenderPerson1 = tenderPerson1;
    }

    @Override
    public String toString() {
        return "TenderRequest{" +
                "tenderRef1='" + tenderRef1 + '\'' +
                ", tenderName1='" + tenderName1 + '\'' +
                ", tenderPerson1='" + tenderPerson1 + '\'' +
                '}';
    }
}
