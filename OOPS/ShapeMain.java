package OverriddingPolymorphism;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a=new Circle();
		a.draw();a.erase();
		Shape b=new Triangle();
		b.draw();b.erase();
		Shape c=new Square();
		c.draw();c.erase();
	}

}
