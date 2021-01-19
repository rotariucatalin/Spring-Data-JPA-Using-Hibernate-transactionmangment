package com.example.transactionmangment.models;

import javax.persistence.*;

@Entity
@Table(name = "bankaccount")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accno;
    private String lastname;
    private String firstname;
    private int bal;

    public BankAccount(){

    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accno=" + accno +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", bal=" + bal +
                '}';
    }
}
