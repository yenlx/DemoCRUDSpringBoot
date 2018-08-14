package vn.yenlx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.yenlx.DAO.StudentDAO;
import vn.yenlx.POJO.Student;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<Student> getAllStudent() {
		return studentDAO.getAllStudent();
	}

	@Override
	public Student getStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
