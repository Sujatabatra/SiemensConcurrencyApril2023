package com.sujata.demo;

public class Book {

	private int bId;
	private String bName;
	private String authorName;
	private int noOfPages;
	private int price;
	public Book() {
		
	}
	public Book(int bId, String bName, String authorName, int noOfPages, int price) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.authorName = authorName;
		this.noOfPages = noOfPages;
		this.price = price;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", authorName=" + authorName + ", noOfPages=" + noOfPages
				+ ", price=" + price + "]";
	}
	
	
}
