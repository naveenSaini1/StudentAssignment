package com.example.demo.Service;

import com.example.demo.exception.studentException;
import com.example.demo.model.student;

import java.util.List;

public interface studentService {

    student registerStudent(student s)throws studentException;
    student getStudentById(Integer id)throws studentException;
    student updateStudent(Integer id,student s)throws studentException;
    String deleteStudent(Integer id,student s)throws studentException;
    List<student> studentList() throws studentException;

}
