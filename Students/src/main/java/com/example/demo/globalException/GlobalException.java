package com.example.demo.globalException;

import com.example.demo.exception.studentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(studentException.class)
    public ResponseEntity<String> studentExceptionHandler(studentException s){
        return new ResponseEntity<String>(s.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> globalExceptionHandler(Exception s){
        return new ResponseEntity<String>(s.getMessage(), HttpStatus.BAD_REQUEST);
    }




}
