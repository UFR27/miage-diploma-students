package fr.pantheonsorbonne.miage;

public class Student {

	private int id;
	private String password;
<<<<<<< HEAD
<<<<<<< HEAD
=======
	private String name;
	private String title;
>>>>>>> encryption-unit-tests
=======
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288

	public Student(int id, String name, String title, String password) {
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

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getName();
	}

	public String getPassword() {
		return this.password;
	}
}
