package ArrayListPrograms;

import java.util.ArrayList;

class Book {
		int id;
		String name, author, publisher;
		int quantity;
		public Book(int id, String name, String author, String publisher, int quantity) {
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}
	}
	public class Arraylist9 {
		public static void main(String[] args) {
			// Creating list of Books
			ArrayList list = new ArrayList<Book>();//Generic
			// Creating Books
			Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
			Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
			Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
			// Adding Books to list
			list.add(b1);
			list.add(b2);
			list.add(b3);
			list.add(new Book(104, "Let us Code it", "xyz", "pqr", 5));
			
//			System.out.println(list.get(0).name);
//			System.out.println(b1.name);
			// Traversing list
			for (Object b : list) {
				System.out.println(b1.id + " " + b1.name + " " + b1.author + " " + b1.publisher + " " + b1.quantity);
			}
		}
	}