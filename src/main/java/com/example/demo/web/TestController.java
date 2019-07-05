package com.example.demo.web;

import com.example.demo.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model m){
        String htmlContent = "<p style='color:red'> red</p>";
        Product currentProduct = new Product(5,"product e", 200);
        boolean testBoolean = true;

        m.addAttribute("htmlContent", htmlContent);
        m.addAttribute("currentProduct", currentProduct);
        m.addAttribute("testBoolean", testBoolean);

        return "test";
    }
}
