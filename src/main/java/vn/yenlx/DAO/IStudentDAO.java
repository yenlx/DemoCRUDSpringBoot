package vn.yenlx.DAO;

import java.util.List;

import vn.yenlx.POJO.Student;

public interface IStudentDAO {
	List<Student> getAllStudent();

	Student getStudent();

	void addStudent(Student student);

	void deleteStudent(int id);

	void updateSudent(Student student);
}
