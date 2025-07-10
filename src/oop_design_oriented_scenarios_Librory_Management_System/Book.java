package oop_design_oriented_scenarios_Librory_Management_System;

public class Book {
	private int bookId;
	private String bookTitle;

	public Book(int bookId, String bookTitle) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + "]";
	}

}
