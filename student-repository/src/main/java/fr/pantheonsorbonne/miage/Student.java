package fr.pantheonsorbonne.miage;

public class Student {

	private int id;
	private String name;
	private String title;
	private String password;

	public Student(int id, String name, String title, String password) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.password = password;
	}

	public int getId() {
		return this.id;
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

	public String getPassword() {
		return this.password;
	}

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getName();
	}
}