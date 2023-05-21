package com.aninfo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private Date date;
    private Long cbu;
    private String type;

    public Transaction() {
        this.date = new Date();
    }

    public Transaction(Double amount, Long cbu, String type) {
        this.amount = amount;
        this.cbu = cbu;
        this.type = type;
        this.date = new Date();
    }

    public Long getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public Long getCbu() {
        return cbu;
    }

    public String getType() {
        return type;
    }
}
