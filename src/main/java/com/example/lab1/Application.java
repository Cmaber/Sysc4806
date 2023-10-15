package com.example.lab1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

//        @Bean
//        public CommandLineRunner demo(ARepository repository) {
//            return (args) -> {
//                AddressBook a = new AddressBook();
//                a.addBuddies(new BuddyInfo("Jack", 456));
//                a.addBuddies(new BuddyInfo("Chloe", 345));
//                a.addBuddies(new BuddyInfo("Kim", 676));
//                repository.save(a);
//
//                log.info("AddressBook found with findAll():");
//                log.info("-------------------------------");
//                for (AddressBook ad : repository.findAll()) {
//                    log.info(ad.toString());
//                }
//                log.info("");
//
//                // fetch an individual customer by ID
//                AddressBook customer = repository.findById(1L);
//                log.info("AddressBook found with findById(1L):");
//                log.info("--------------------------------");
//                log.info(customer.toString());
//                log.info("");
//            };
//    }
//
//
//    @Bean
//    public CommandLineRunner demo1(ABRepo repository) {
//        return (args) -> {
//
//
//            repository.save(new BuddyInfo("Jack", 456));
//
//            log.info("BuddyInfo found with findAll():");
//            log.info("-------------------------------");
//            for (BuddyInfo ad : repository.findAll()) {
//                log.info(ad.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            BuddyInfo customer = repository.findById(1L);
//            log.info("BuddyInfo found with findById(1L):");
//            log.info("--------------------------------");
//            log.info(customer.toString());
//            log.info("");
//        };
//    }



}
