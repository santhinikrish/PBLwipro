package Encapsulation;

public class Author {
	String name,email;
	char gender;
	Author(String name,String email,char gender){
		System.out.println("Author details: ");
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
