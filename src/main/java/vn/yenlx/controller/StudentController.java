package vn.yenlx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.yenlx.POJO.Student;
import vn.yenlx.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/findAllStudent")
	public String findAllStudent(Model model){
		List<Student> lstStudent = studentService.getAllStudent();
		model.addAttribute("listStudent",lstStudent);
		return "list";
	}
	@GetMapping("/DeleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id ) {
		studentService.deleteStudent(id);
		return "list";
	}
	
	
	
}
