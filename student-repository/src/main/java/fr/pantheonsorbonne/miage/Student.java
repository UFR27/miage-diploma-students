package fr.pantheonsorbonne.miage;

public class Student {

	private int id;


	public Student(int id, String name, String title, String pwd) {
		this.name = name;
		this.title = title;
		this.id = id;
		this.pwd = pwd;

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
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private String pwd;

	
}
