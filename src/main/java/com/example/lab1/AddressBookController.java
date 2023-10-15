package com.example.lab1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import java.util.List;

@RestController
public class AddressBookController {

    private final ARepository Repo;

    @Autowired
    public AddressBookController(ARepository c){
        Repo = c;
    }

    @GetMapping("CreateBook")
    public String CreateBook(){
        AddressBook a = new AddressBook();
        Repo.save(a);
        return "Created AddressBook with ID: " + a.getId();
    }

}
