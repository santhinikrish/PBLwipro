package OverriddingPolymorphism;

public class Triangle extends Shape{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
