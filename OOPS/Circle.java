package OverriddingPolymorphism;

public class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
