package com.devopire.studentDB.controller;

import com.devopire.studentDB.model.Phone;
import com.devopire.studentDB.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneController {

    @Autowired
    PhoneRepository phoneRepository;

    @GetMapping("/phone")
    public List<Phone> getPhoneDetails(){
        return phoneRepository.findAll();
    }
}
