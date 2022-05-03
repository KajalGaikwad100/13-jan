package ArrayListPrograms;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arraylist4 {

	
		public static void main(String args[]) {
			ArrayList<String> al = new ArrayList<String>();
			  System.out.println("Is ArrayList Empty: "+al.isEmpty());  
			al.add("Ravi");
			al.add("Vijay");
			al.add("Ajay");
			al.add("Hanumat");
			ArrayList<String> al2 = new ArrayList<String>();
			al2.add("Ravi");
			al2.add("Hanumat");
			al2.add("Pune");
			System.out.println("al list elements: "+al);
			System.out.println("al2 list elements: "+al2);
			al.retainAll(al2);
			System.out.println("al list after retailAll(): "+al);
			System.out.println("iterating the elements after retaining the elements of al2");
			java.util.Iterator<String> itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			ArrayList l1=new ArrayList();
			l1.add("Pune");
			l1.add("Pune");
			l1.add(123);
			l1.add("Pune");
			l1.add(null);
			System.out.println(l1);
		}
	}
