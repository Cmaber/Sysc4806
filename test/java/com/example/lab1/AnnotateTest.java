package com.example.lab1;
//
//import jakarta.persistence.*;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class AnnotateTest {
//
//    @Autowired
//    ARepository repo;
//
//    @Test
//    public void performAnnotateTest() throws InstantiationException, IllegalAccessException {
//        BuddyInfo b = new BuddyInfo("Chris",34355453);
//        BuddyInfo a = new BuddyInfo("Christopher",99999);
//        //repo.save(b);
//        //repo.save(a);
//    }
//
//    @Test
//    public void performAnnotateTest2() throws InstantiationException, IllegalAccessException {
//        AddressBook a1 = new AddressBook();
//        BuddyInfo b = new BuddyInfo("Chris",34355453);
//        BuddyInfo a = new BuddyInfo("Christopher",99999);
//        a1.addBuddies(b);
//        a1.addBuddies(a);
//        repo.save(a1);
//    }
//}