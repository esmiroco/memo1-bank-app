package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Account {

    @Id // esta es la primary key (base de datos relacional)
    @GeneratedValue(strategy = GenerationType.AUTO) // auto generado cada vez que se cree una cuenta
    private Long cbu;

    private Double balance;

    public Account(){
    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(Double amount) {
        this.balance -= amount;
    }

    public void deposit(Double amount) {
        if(amount<2000){
            this.balance += amount;
        }else if((2000 <= amount) && (amount <= 5000)){
            this.balance += amount*1.1;
        }else{
            this.balance += amount + 500;
        }
    }
}
