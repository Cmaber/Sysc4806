package com.example.lab1;

import jakarta.persistence.*;
//import jak

@Entity
public class BuddyInfo {

    private long PhoneNum;
    private String name;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id = null;

    public BuddyInfo(String name, long PhoneNum){
        this.PhoneNum = PhoneNum;
        this.name = name;
    }

    public BuddyInfo() {

    }

    public String getName() {
        return name;
    }

    public long getPhoneNum() {
        return PhoneNum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
                "BuddyInfo[id=%d, firstName='%s', Phone='%s']",
                id, name, PhoneNum);
    }

    public void setName(String namee) {
        name = namee;
    }
}