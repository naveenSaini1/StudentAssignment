package com.example.demo.ServiceImpl;

import com.example.demo.Repo.studentRepo;
import com.example.demo.Service.studentService;
import com.example.demo.exception.studentException;
import com.example.demo.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    studentRepo studentRepo1;

    @Override
    public student registerStudent(student s) throws studentException {
       return studentRepo1.save(s);
    }

    @Override
    public student getStudentById(Integer id) throws studentException {
       Optional<student> s1 = studentRepo1.findById(id);
       if(s1.isEmpty()) throw new studentException("id is not valid");
        return s1.get();
    }

    @Override
    public student updateStudent(Integer id,student s) throws studentException {

       Optional<student> s1 = studentRepo1.findById(id);
       if(s1.isEmpty()){
           throw new studentException("No Record Find with this ID");
       }
       s.setStudentID(id);
       return studentRepo1.save(s);

    }

    @Override
    public String deleteStudent(Integer id,student s) throws studentException {
        Optional<student> s1 = studentRepo1.findById(id);
        if(s1.isEmpty()){
            throw new studentException("No Record Find with this ID");
        }
        studentRepo1.delete(s1.get());

        return "Record Deleted Successful";
    }

    @Override
    public List<student> studentList() throws studentException {

        List<student> s1  = studentRepo1.findAll();
        if(s1 == null){
            throw new studentException("No Records Found");
        }
        return s1;

    }
}
