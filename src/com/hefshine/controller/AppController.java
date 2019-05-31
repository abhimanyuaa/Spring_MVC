package com.hefshine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hefshine.beans.Student;

@Controller
public class AppController {

	@RequestMapping("/")
	public String helloPage() {

		return "hello";
	}

	@RequestMapping("/profile")
	public String profilePage(ModelMap map) {

		map.addAttribute("student", new Student(101, "Kalpna", "Singhania"));

		return "profile";
	}

	@RequestMapping("/input")
	public String inputPage() {

		return "input";
	}

	@RequestMapping("/Display")
	public String displayAction(@RequestParam("number") int number) {

		System.out.println("Called by " + number);

		return "redirect:/";
	}
}
