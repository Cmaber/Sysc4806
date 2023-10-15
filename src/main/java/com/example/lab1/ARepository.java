package com.example.lab1;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface ARepository extends ListCrudRepository<AddressBook, Long> {
    AddressBook findById(long id);

}
