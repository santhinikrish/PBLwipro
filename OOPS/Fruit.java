package OverriddingPolymorphism;

import java.util.Scanner;

public class Fruit {
	public String name="",taste="";
	public int size;
	Scanner sc=new Scanner(System.in);
	public void eat() {
		name=sc.next();
		System.out.println("The name of the fruit is "+name);
		taste=sc.next();
		System.out.println("And the taste is "+taste);
		
	}
}
