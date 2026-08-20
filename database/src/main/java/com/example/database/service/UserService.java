package com.example.database.service;

import com.example.database.model.StudentM;
import com.example.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

     @Autowired
     UserRepository userRepository;

     public StudentM saveUser(@RequestBody StudentM user) {

         return userRepository.save(user);
    }

     public List<StudentM> findAll(){
         return userRepository.findAll();
     }
}
