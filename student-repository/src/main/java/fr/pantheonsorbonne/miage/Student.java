package fr.pantheonsorbonne.miage;

public class Student {

	private int id;
	private String password;

<<<<<<< HEAD

=======
>>>>>>> encryption
	public Student(int id, String name, String title, String password) {
		this.name = name;
		this.title = title;
		this.id = id;
<<<<<<< HEAD
		this.password=password;

=======
		this.password = password;
>>>>>>> encryption
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

	public String getPassword() {
<<<<<<< HEAD
		return password;
	}


=======
		return this.password;
	}
>>>>>>> encryption
}
