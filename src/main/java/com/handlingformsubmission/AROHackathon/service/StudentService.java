package com.handlingformsubmission.AROHackathon.service;
import com.handlingformsubmission.AROHackathon.entity.Student;
import com.handlingformsubmission.AROHackathon.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Student addStudent( Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById( Integer stuId){
        return studentRepository.findById(stuId);
    }

    public void deleteMe( Integer stuId){
        studentRepository.deleteById(stuId);
    }


}
