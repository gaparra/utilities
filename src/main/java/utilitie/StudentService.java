package utilitie;

import java.util.List;

public interface StudentService {
	
	public List<Student> findAll();
	
	public List<Student> findAll(String name);
	
	public Student getStudent(String id);
}
