package com.example.database.repository;

import com.example.database.model.StudentM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<StudentM, Integer> {

    }
