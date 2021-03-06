package vn.yenlx.service;

import java.util.List;

import vn.yenlx.POJO.Student;

public interface IStudentService {
	List<Student> getAllStudent();

	Student getStudent();

	void addStudent(Student student);

	void deleteStudent(int id);

	void updateSudent(Student student);
	
	Student findOneStudent(int id);
}
