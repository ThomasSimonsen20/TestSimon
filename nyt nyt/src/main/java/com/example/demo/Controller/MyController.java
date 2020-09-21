package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {

    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() { return "Test virker"; }

}
