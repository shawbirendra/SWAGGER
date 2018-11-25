package com.techiebirendra.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techiebirendra.demo.beans.Student;

@Repository("studentDAO")
public class StudentDAO {
	public static List<Student> studentsData = new ArrayList<>();

	public int save(Student student) {
		if (student != null) {
			studentsData.add(student);
			return 1;
		}
		return 0;

	}

	public List<Student> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return studentsData;
	}

	public Student findById(int id) {
		if (studentsData.size() > 0) {
			return studentsData.stream().filter(s -> s.getId() == id).findFirst().get();
		}
		return null;
	}
}
