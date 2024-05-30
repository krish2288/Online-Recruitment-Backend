package com.infosys.Online.recruitment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Online.recruitment.Entity.Student;
import com.infosys.Online.recruitment.Service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
<<<<<<< HEAD

=======
>>>>>>> ee8557d2d0eeb9b76ccd3fac3a768cb81b3c131c
public class StudentController {
	@Autowired
	StudentService service;
	
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		
		return service.getAllStudents();
		
	}
	
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
}
