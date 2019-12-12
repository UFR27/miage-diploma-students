package fr.pantheonsorbonne.miage;

public class Student {

	private int id;
 	private String password;
 	private String name;
 	private String title;

	public Student(int id, String name, String title, String password) {
		this.name = name;
		this.title = title;
		this.id = id;
		this.password=password;

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
	
	
    public String getpaswword() {
    	return this.password;
    }
    
    
    public void setPassword(String password) {
    	this.password=password;
    }
    
    
	@Override
	public String toString() {
		return this.getTitle() + " " + this.getName();
	}

	
}
