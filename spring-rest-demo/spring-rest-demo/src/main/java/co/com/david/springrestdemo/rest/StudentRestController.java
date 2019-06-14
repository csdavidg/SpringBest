package co.com.david.springrestdemo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.david.springrestdemo.entity.Student;
import co.com.david.springrestdemo.exception.StudentNotFoundException;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@GetMapping("/{studentId}")
	public Student getStudentById(@PathVariable int studentId) {
		Student student = this.getFullStudentsList().stream().filter(s -> studentId == s.getId()).findAny()
				.orElse(null);
		if (student == null) {
			throw new StudentNotFoundException("The student does not exist");
		}
		return student;
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return this.getFullStudentsList();
	}

	private List<Student> getFullStudentsList() {
		return Arrays.asList(new Student(1, "David", "Sanchez"), new Student(2, "Nicolas", "Gonzalez"),
				new Student(3, "Paola", "Pachon"));
	}

}
