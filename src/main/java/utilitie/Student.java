package utilitie;

public class Student {
	
	private String id;
	private String name;
	
	public Student(String id, String nom) {
		this.id = id;
		this.name = nom;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
