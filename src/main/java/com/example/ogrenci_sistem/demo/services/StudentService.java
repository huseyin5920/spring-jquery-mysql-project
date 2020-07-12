package com.example.ogrenci_sistem.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ogrenci_sistem.demo.StudentRepository;
import com.example.ogrenci_sistem.demo.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudents(){
		return (List<Student>) studentRepository.findAll();
	}
	
	public Optional<Student> getStudentById(Integer Id){
		return studentRepository.findById(Id);
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(Integer Id) {
		studentRepository.deleteById(Id);
	}
	
}
