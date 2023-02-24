package com.example.demo.Controller;

import com.example.demo.ServiceImpl.studentServiceImpl;
import com.example.demo.exception.studentException;
import com.example.demo.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class studentController {

    @Autowired
    studentServiceImpl studentServiceImpl1;

    @GetMapping("/student")
     public ResponseEntity<List<student>>getAllStudent() throws studentException {
      return new ResponseEntity<List<student>>(studentServiceImpl1.studentList(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<student> getStudentById(@PathVariable Integer id) throws studentException{
        return new ResponseEntity<student>(studentServiceImpl1.getStudentById(id),HttpStatus.OK);
    }

    @PostMapping("/student/{id}")
    public ResponseEntity<student> UpdateStudentById(@PathVariable Integer id,@RequestBody student s) throws studentException{
        return new ResponseEntity<student>(studentServiceImpl1.updateStudent(id,s),HttpStatus.CREATED);
    }

    @PostMapping("/student")
    public ResponseEntity<student> saveHandlled(@RequestBody student st) throws studentException {
        return new ResponseEntity<student>(studentServiceImpl1.registerStudent(st),HttpStatus.CREATED);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id,@RequestBody student s) throws studentException{
        return new ResponseEntity<String>(studentServiceImpl1.deleteStudent(id,s),HttpStatus.OK);
    }











}
