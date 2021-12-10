package fr.pantheonsorbonne.miage;

public class Student {

	private int id;
	private String password;
	private String name;

	public Student(int id, String name, String title, String password) {
		this.name = name;
		this.title = title;
		this.id = id;
		this.password = password;
	}



	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String title;

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getName();
	}

	public String getPassword() {
		return this.password;
	}
}
