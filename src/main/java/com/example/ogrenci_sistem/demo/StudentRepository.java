package com.example.ogrenci_sistem.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ogrenci_sistem.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
