package com.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("hello")
    public String getHello() {
        return "dddddddddd";
    }

    // api 등록 후 build 테스트

    // 리전 변경 3

}
