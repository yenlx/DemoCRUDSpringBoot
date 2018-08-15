package vn.yenlx.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import vn.yenlx.POJO.Student;

@Repository
@Transactional
public class StudentDAO implements IStudentDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Student> getAllStudent() {
		String hql = "from Student";
		return (List<Student>) entityManager.createQuery(hql).getResultList();
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
		Student student = entityManager.find(Student.class, id );
		entityManager.remove(student);
		flushAndClear();
	}

	@Override
	public void updateSudent(Student student) {
		
		entityManager.merge(student);
;		flushAndClear();
	}
	
	void flushAndClear() {
	    entityManager.flush();
	    entityManager.clear();
	}

	@Override
	public Student findOneStudent(int id) {
		Student obj = entityManager.find(Student.class, id);
		return obj;
	}
	
}
