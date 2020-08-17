package Encapsulation;

public class Book extends Author {
	Book(String name, String email, char gender) {
		super(name, email, gender);
	}
	String Bname,author;
	double price;
	int qtyInStock;
	public String getName() {
		return Bname;
	}
	public void setName(String Bname) {
		this.Bname = Bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
}
