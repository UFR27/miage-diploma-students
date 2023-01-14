package fr.pantheonsorbonne.miage;

public class Student {

	private int id;

<<<<<<< Updated upstream

	public Student(int id, String name, String title) {
=======
<<<<<<< Updated upstream
	public Student(int id, String name, String title, String password) {
=======

	public Student(int id, String name, String title, String string) {
>>>>>>> Stashed changes
>>>>>>> Stashed changes
		this.name = name;
		this.title = title;
		this.id = id;

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

	private String title;

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getName();
	}

	
}
