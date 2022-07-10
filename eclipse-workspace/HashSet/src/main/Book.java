package main;

public class Book {
private String name;
private int price;

public Book(String name, int price) {
	this.name = name;
	this.price = price;
}

public String getBook() {
	return this.name;
}

public int getPrice() {
	return this.price;
}

@Override
public String toString() {
	return "Book Name ==> "+getBook()+ "\nBook Price ==> "+ getPrice();
}
}
