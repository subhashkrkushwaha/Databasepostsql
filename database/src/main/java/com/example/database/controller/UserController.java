package com.example.database.controller;

import com.example.database.model.StudentM;
import com.example.database.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class UserController {

         @Autowired
         UserService userService;
         @PostMapping("/create")
       public StudentM saveUser(@RequestBody StudentM user) {
             return userService.saveUser(user);
         }

         @GetMapping("/get-all")
         public List<StudentM> findAll(){
             return userService.findAll();
         }
}
