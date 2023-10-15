package com.example.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final ARepository ARepo;
    private final ABRepo Repo;

    @Autowired
    public MainController(ABRepo aRepo, ARepository c){

        ARepo = c;
        Repo = aRepo;
    }

    @GetMapping("/getBook")
    public String getBook(@RequestParam("ID") int id, Model model){
        AddressBook a = ARepo.findById(id);
        model.addAttribute(a);
        model.addAttribute("buddies", a.getList());
        return "getBook";
    }

    @GetMapping("/getBuddy")
    public String getBuddy(@RequestParam("ID") int id, Model model){
        BuddyInfo b = Repo.findById(id);
        model.addAttribute(b);
        return "getBuddy";
    }


}