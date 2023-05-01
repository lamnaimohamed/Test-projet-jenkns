package com.jenkins.testproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("rest")
public class Controller {

    @GetMapping(value = "/helloword")
    public String hellow(){
        return " bonjour tous le monde test 08 ";
    }

    @GetMapping(value = "/bonjour")
    public String hellow02(){
        return " bonjour tous le monde   dfvsdfsd qda zd sdfsdfsd qdq ";
    }


}
