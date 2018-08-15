package vn.yenlx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.yenlx.POJO.Student;
import vn.yenlx.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/findAllStudent")
	public String findAllStudent(Model model) {
		List<Student> lstStudent = studentService.getAllStudent();
		model.addAttribute("listStudent", lstStudent);
		return "list";
	}

	@GetMapping("/DeleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
		return "redirect:/student/findAllStudent";
	}

	@RequestMapping(path="/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") int id , Model model) {
		Student student = studentService.findOneStudent(id);
		model.addAttribute("student", student);
		return "edit";
	}

	@PostMapping("/EditStudent")
	public String editStudent(@ModelAttribute("student") Student student) {
		studentService.updateSudent(student);
		return "redirect:/student/findAllStudent";
	}

	@PostMapping("/AddStudent")
	public String addStudent() {

		return "redirect:/student/findAllStudent";
	}
//	@GetMapping("/add")
//	public String add() {
//		return "add";
//	}

}
