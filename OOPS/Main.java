package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a=new Book("Priya", "abc@gmail.com", 'F');
		a.setName("Mirachel");
		a.setAuthor("John");
		a.setPrice(2345.234);
		a.setQtyInStock(5);
		System.out.println(a.getName());
		System.out.println(a.getAuthor());
		System.out.println(a.getPrice());
		System.out.println(a.getQtyInStock());
	}
}
