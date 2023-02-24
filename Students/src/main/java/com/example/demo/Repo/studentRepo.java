package com.example.demo.Repo;

import com.example.demo.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<student,Integer> {
}
