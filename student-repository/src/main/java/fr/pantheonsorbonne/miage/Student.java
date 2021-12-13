package fr.pantheonsorbonne.miage;

public class Student {

	private int id;
	private String password;

	public Student(int id, String name, String title, String password) {
		this.name = name;
		this.title = title;
		this.id = id;
		this.password = password;
	}

	private String name;

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	private String title;

	public int getId() {
		return this.id;
	}

	public String getPassword() {
		return this.password;
	}
}
