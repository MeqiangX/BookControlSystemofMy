package com.mybcs.bean;

public class Book {
     private int id;
     private String name;
     private Double price;
     private int bookCount;
     private String author;
     
     public Book() {}
     public Book(int id,String name,Double price,int bookCount,String author) {
    	 this.id = id;
    	 this.name = name;
    	 this.price = price;
    	 this.bookCount = bookCount;
    	 this.author = author;
     }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
     
     
     
     
}
