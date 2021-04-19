package com.book;

public class Book {
	private String bookId;
	private String bookName;
	private String author;
	private String category;
	private float price;
	public Book(String bookId,String bookName,String author,String category,float price){
		if(this.bookId=="B"&&bookId.length()==4) {
			this.bookId=bookId;
		}else {
			System.out.println("Invalid Book ID");
		}
		this.bookName=bookName;
		this.author=author;
		if(category.equalsIgnoreCase("Science")||category.equalsIgnoreCase("Fiction")||category.equalsIgnoreCase("Technology")||category.equalsIgnoreCase("Others"))
		{
			this.category=category;
		}else {
			System.out.println("Invalid Category");
		}
		if(this.price<0) {
			System.out.println("Invalid Price");
		}
		else {
			this.price=price;
		}
		
	}
	@Override
	public String toString() {
		return "bookID : " + bookId + "\n bookTitle : " + bookName + "\nauthor : " + author + "\ncategory : "
				+ category + "\nprice=" + price;
	}
	
}
