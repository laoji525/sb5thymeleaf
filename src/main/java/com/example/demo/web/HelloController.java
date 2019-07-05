package com.example.demo.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("name", "thymeleaf");
        return "hello";
    }


}
