package com.Spring.bean.admin.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Spring.bean.admin.beans.Student;
import com.Spring.bean.admin.repository.studentRepo;

import java.util.List;

@Controller
public class StudentController {
	@Autowired
	private studentRepo repo;

	@GetMapping("/Student")
	public String showHomePage() {
		return "index";
	}


	@GetMapping("Student/all")
	public String getStudents(Model model) {
		List<Student> studentList = new ArrayList<Student>();
		studentList = repo.findByName("angel");
		System.out.println(studentList.toString());
		model.addAttribute("studentList", studentList);
		return "view";
	}
	@PostMapping("/Student/sucess")
	public String login(Student student, Model model) {
		repo.save(student);
		model.addAttribute("s", student);
		return "sucess";
	}
}
