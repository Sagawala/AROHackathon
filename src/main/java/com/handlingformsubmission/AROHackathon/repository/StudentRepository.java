package com.handlingformsubmission.AROHackathon.repository;
import com.handlingformsubmission.AROHackathon.entity.Student;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
