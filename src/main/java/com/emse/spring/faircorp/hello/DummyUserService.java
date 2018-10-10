package com.emse.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DummyUserService{

    @Autowired
    private GreetingService greetingService;

    public void greetAll(){

        ArrayList<String> list = new ArrayList<String>();
        list.add("Elodie");
        list.add("Charles");

        for (String name : list) {
            greetingService.greet(name);
        }
    }
}
