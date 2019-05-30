package co.com.david.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.david.mvc.dto.Student;

@Controller
@RequestMapping("student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());

		return "student-form";
	}

	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}

}
