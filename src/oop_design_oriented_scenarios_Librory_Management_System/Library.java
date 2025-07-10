package oop_design_oriented_scenarios_Librory_Management_System;

import java.util.List;

public abstract class Library {

	private List<Book> books;
	private List<User> users;

	public Library(List<Book> books, List<User> users) {
		super();
		this.books = books;
		this.users = users;
	}

	public abstract void barrowBook(User user, Book book);

	public abstract void returnBook(User user, Book book);

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
