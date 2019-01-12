package com.enigma.dev.request;

import java.io.Serializable;

public class TenderEditRequest implements Serializable {
    private String editTenderRef;
    private String editTenderName;
    private String editTenderPerson;

    public String getEditTenderRef() {
        return editTenderRef;
    }

    public void setEditTenderRef(String editTenderRef) {
        this.editTenderRef = editTenderRef;
    }

    public String getEditTenderName() {
        return editTenderName;
    }

    public void setEditTenderName(String editTenderName) {
        this.editTenderName = editTenderName;
    }

    public String getEditTenderPerson() {
        return editTenderPerson;
    }

    public void setEditTenderPerson(String editTenderPerson) {
        this.editTenderPerson = editTenderPerson;
    }

    @Override
    public String toString() {
        return "TenderEditRequest{" +
                "editTenderRef='" + editTenderRef + '\'' +
                ", editTenderName='" + editTenderName + '\'' +
                ", editTenderPerson='" + editTenderPerson + '\'' +
                '}';
    }
}
