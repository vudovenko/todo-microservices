package ru.vudovenko.micro.demo.eurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test1";
    }
}
