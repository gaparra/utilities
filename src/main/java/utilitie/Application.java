package utilitie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {
	private StudentService studentServ;
	
	public Application(StudentService stuserv) {
		studentServ = stuserv;
	}
	
	public List<String> findAllStudentNames(){
		
		return studentServ.findAll().stream().map(student->StringUtils.capitalize(student.getName())).collect(Collectors.toList());
	}
	
	public List<String> findAllStudentNames(String name){
		
		ArrayList<String> goodName = new ArrayList<String>();
		
		for(Student student : studentServ.findAll()) {
			if(student.getName().contains(name)) {
				goodName.add(student.getName());
			}
		}
		return goodName;
	}
	
	public String getStudent(String id) {
		Student student = studentServ.getStudent(id);
		return student.getName();
	}
}
