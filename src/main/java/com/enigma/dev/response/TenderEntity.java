package com.enigma.dev.response;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table (name="tender_crud")

public class TenderEntity {
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tender_ref")
    @Size(max = 255)
    private String tenderRef;

    @Column(name = "tender_name")
    @Size(max = 255)
    private String tenderName;


    @Column(name = "tender_person")
    @Size(max = 255)
    private String tenderPerson;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenderRef() {
        return tenderRef;
    }

    public void setTenderRef(String tenderRef) {
        this.tenderRef = tenderRef;
    }

    public String getTenderName() {
        return tenderName;
    }

    public void setTenderName(String tenderName) {
        this.tenderName = tenderName;
    }

    public String getTenderPerson() {
        return tenderPerson;
    }

    public void setTenderPerson(String tenderPerson) {
        this.tenderPerson = tenderPerson;
    }

    @Override
    public String toString() {
        return "TenderEntity{" +
                "id=" + id +
                ", tenderRef='" + tenderRef + '\'' +
                ", tenderName='" + tenderName + '\'' +
                ", tenderPerson='" + tenderPerson + '\'' +
                '}';
    }
}
