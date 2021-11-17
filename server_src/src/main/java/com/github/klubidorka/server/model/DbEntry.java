package com.github.klubidorka.server.model;

import javax.persistence.*;

@Entity
@Table(name = "data")
public class DbEntry {
    private int number;
    private String text;

    public DbEntry() {
    }

    public DbEntry(int intValue, String stringValue) {
        this.number = intValue;
        this.text = stringValue;
    }

    @Id
    public int getNumber() {
        return number;
    }

    public void setNumber(int intValue) {
        this.number = intValue;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

