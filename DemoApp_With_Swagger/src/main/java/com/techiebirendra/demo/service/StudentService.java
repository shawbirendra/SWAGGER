package com.techiebirendra.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techiebirendra.demo.beans.Student;
import com.techiebirendra.demo.dao.StudentDAO;

@Service("studentService")
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public String save(Student student) {
		int count = studentDAO.save(student);
		if (count == 1)
			return "student details persisted in db";
		return "error occured while persisting data in db {} ";

	}

	public List<Student> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return studentDAO.getAllStudentDetails();
	}

	public Student findById(int id) {
		// TODO Auto-generated method stub
		Student s=studentDAO.findById(id);
		if(s!=null) {
			return s;
		}
		return null;
	}
}
