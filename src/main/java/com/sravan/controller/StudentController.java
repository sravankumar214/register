package com.sravan.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sravan.Student;
import com.sravan.dao.StudentDaoImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentDaoImpl studentDaoImpl;

	@RequestMapping(value = "getform", method = RequestMethod.GET)
	public String loadForm(Model model) {

		model.addAttribute("student", new Student());
		List<Student> cources = studentDaoImpl.getCources();
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		for (Student obj : cources) {
			Integer cid = obj.getCourseId();
			String cname = obj.getCourseName();
			map.put(cid, cname);
		}
		model.addAttribute("courses", map);
		System.out.println(cources);

		return "index";
	}

}
