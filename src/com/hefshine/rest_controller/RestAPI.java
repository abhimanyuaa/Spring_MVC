package com.hefshine.rest_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.beans.Student;

@RestController
public class RestAPI {

	@GetMapping("/api/student")
	public String getStudentById() {
		
		System.out.println("Called");

		return new Student(101, "Apeksha", "Manjarekar").toString();
	}
}



























