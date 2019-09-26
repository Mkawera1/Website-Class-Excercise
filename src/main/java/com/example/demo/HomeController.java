package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Cars(){
        return "Cars";
    }
    @GetMapping("/AboutUs")
    public String AboutUs() {
        return "AboutUs";
    }
    @GetMapping("/Showroom")
    public String ShowRoom() {
        return "ShowRoom";
    }
    @GetMapping("/Sales")
    public String Sales(){
        return "Sales";
    }
    @GetMapping("/AutoParty")
    public String AutoParty(){
        return "AutoParty";
    }


}
