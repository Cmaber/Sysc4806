package com.example.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BuddyInfoController {
    private final ABRepo Repo;
    private final ARepository ARepo;

    @Autowired
    public BuddyInfoController(ABRepo c, ARepository aRepo){
        Repo = c;
        ARepo = aRepo;
    }

    @GetMapping("CreateBuddy")
    public String CreateBuddy(@RequestParam(name = "name") String name, @RequestParam("ID") int Id){
        BuddyInfo b = new BuddyInfo(name, Id);
        Repo.save(b);
        return "Created Buddy " + b.getName() + " With Id: " + b.getId();
    }

    @GetMapping("addBuddy")
    public String addBuddy(@RequestParam(name = "name") int id1, @RequestParam("ID") int id2){
        AddressBook a = ARepo.findById(id1);
        BuddyInfo b = Repo.findById(id2);
        a.addBuddies(b);
        ARepo.save(a);

        return "Added Buddy " + b.getName() + " With Id: " + b.getId() + " To AddressBook Id: " + a.getId();
    }

    @GetMapping("removeBuddy")
    public String removeBuddy(@RequestParam("AID") int id1, @RequestParam("BID") int id2){
        AddressBook a = ARepo.findById(id1);
        BuddyInfo b = Repo.findById(id2);
        a.removeBuddies(b);
        ARepo.save(a);

        return "Removed Buddy " + b.getName() + " With Id: " + b.getId() + " From AddressBook Id: " + a.getId();
    }
}
