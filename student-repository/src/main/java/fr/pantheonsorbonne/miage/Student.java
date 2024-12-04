package fr.pantheonsorbonne.miage;

public class Student {

	private int id;
	private String title;

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

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getName();
	}

}
