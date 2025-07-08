package LabWeek5;
class Book {

  private String name;
  private Author author;
  private double price;
  private int qty = 0;

  public Book(String name, Author author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public Book(String name, Author author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public  String getName() {
    return name;
  }

  public Author getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  @Override
  public String toString() {
    return String.format("%s[name=%s,author=%s,price=%.2f,qty=%d]", 
    this.getClass().getName(), name, author, price, qty);
  }

}

public class BookTest {
  public static void main (String [] args) {
    Author a = new Author("CK","oakabc@gmail.com",'M');
    System.out.println(a);
    Book b = new Book ("My name is CK", a, 100);
    System.out.println(b);    

    }
}
