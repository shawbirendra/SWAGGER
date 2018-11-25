package com.techiebirendra.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techiebirendra.demo.beans.Student;
import com.techiebirendra.demo.service.StudentService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@ApiOperation(value = "saves student details in Database")
	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String save(
			@ApiParam(value = "Please enter the student details to be saved", required = true) @RequestBody Student student) {
		return studentService.save(student);

	}

	@GetMapping(path = "findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value = "Returns all the available details of student from Database")
	public List<Student> getAll() {
		return studentService.getAllStudentDetails();
	}

	@GetMapping(path = "findById", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value = "Returns single available details of student from Database based on student id")
	public Student findById(
			@ApiParam(value = "Requires student id to get details", required = true) @RequestParam int id) {
		return studentService.findById(id);
	}
}
