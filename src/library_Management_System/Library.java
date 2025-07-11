package library_Management_System;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.OptionalDouble;

public class Library {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "Ramayana", "valmiki", "Navel", 1892));
		books.add(new Book(2, "Mahabharata", "V2", "Navel", 1923));
		books.add(new Book(3, "C", "V3", "Navel3", 1924));
		books.add(new Book(4, "D", "V4", "Navel4", 1925));

		// Find the Number of Books
//		long totalBooks = books.stream().count();
//		System.out.println("Number of Books : " + totalBooks);
		// or
//		System.out.println("Number of Books : " + books.size());
		
//<----------------------------------------------------------------------------------------------------------------------------------------------------------->

		// Calculate avarage publictaion year of all book
//		OptionalDouble optionalDouble = books.stream().mapToInt(Book::getPublicationYear).average();

//		System.out.println("Avarage publication year : " + optionalDouble);
		ListIterator<Book> iterator = books.listIterator();

		// Without using stream
		int sum = 0;
		while (iterator.hasNext()) {
			sum += iterator.next().getPublicationYear();
		}
		System.out.println("avarage publictaion year :" + sum / books.size());
		
//<----------------------------------------------------------------------------------------------------------------------------------------------------------->

		// Identify the oldest book in the library
//		Book book = books.stream().min(Comparator.comparing(Book::getPublicationYear)).get();
//
//		System.out.println("oldest book in the library: " + book);
		
//<----------------------------------------------------------------------------------------------------------------------------------------------------------->

		// without stream
//		int minYear = 1925;
//		Book book3 = null;
//		while (iterator.hasNext()) {
//			Book book2 = iterator.next();
//			if (book2.getPublicationYear() < minYear) {
//				minYear = book2.getPublicationYear();
//				book3 = book2;
//			}
//		}

//		System.out.println("oldest book in the library: " + book3);

	}

}
