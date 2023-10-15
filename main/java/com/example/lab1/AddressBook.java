package com.example.lab1;

import jakarta.persistence.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.*;

@EnableJpaRepositories(basePackages="com.example.lab1")
@Entity
public class AddressBook  {

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = BuddyInfo.class)
    public List<BuddyInfo> lst;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    public AddressBook(){
        lst = new ArrayList<>();
    }

    public void addBuddies(BuddyInfo x){
        lst.add(x);
    }

    public void removeBuddies(BuddyInfo x){
        lst.remove(x);
    }

    public List getList(){
        return lst;
    }

    public void printInfo(){
        for (BuddyInfo b:lst) {
            System.out.println("Name:" + b.getName() + ", #:" + b.getPhoneNum() + " ");
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        String s = "";
        for (BuddyInfo b: lst) {
            s = s + b.toString();
        }
        return s;
    }
}