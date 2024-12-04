package fr.pantheonsorbonne.miage;

public class Student {

	private String password;
	private String title;
	private int id;
	private String name;


	public Student(int id, String name, String title,String password) {
		this.name = name;
		this.title = title;
		this.id = id;
		this.password = password;
 
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public int getId() {
		return this.id;
	}

	public String getPassword() {
		return this.password;
	}

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getName();
	}

	
}
