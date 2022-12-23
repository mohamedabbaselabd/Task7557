
package com.mycompany.MyOnlineShop;


public class Book implements Product {
    private String NameOfBook;
    private double Price;

    public String getNameOfBook() {
        return NameOfBook;
    }

    public void setNameOfBook(String NameOfBook) {
        this.NameOfBook = NameOfBook;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public Book(String NameOfBook, double Price) {
        this.NameOfBook = NameOfBook;
        this.Price = Price;
    }

    public Book() {
    }

    @Override
    public void DescriptionBook() {
        System.out.println("the book is good"); 
    }

    @Override
    public void interpetation() {
        System.out.println("the book is interpreted by Kareem Adel"); 
    }

 
    
}
