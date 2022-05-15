package com.example.servingwebcontent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class contUser {

       @RequestMapping(value="/")
       public String Greet(){
             return "hello spring boot";
}
    @GetMapping(value="/{name}")
    public String GreetName(@PathVariable String name){//@PathVariable name contien en URL
        return String.format("hello %s to our  spring boot",name);
    }
}
