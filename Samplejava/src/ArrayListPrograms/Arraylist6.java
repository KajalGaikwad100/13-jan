package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Arraylist6 {
 
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add("Vishal");
		list.add("Prathmesh");
		list.add("Kajal");
		System.out.println("Number of array list is"+list.size());
		System.out.println("Elements of array list is"+list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		ArrayList list1=new ArrayList();

System.out.println(list.clone()); 
System.out.println("Returning particular element : "+list.get(1));

		System.out.println("Add elements"+list.set(1, "Amol"));
		System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	list.forEach(a->{
	System.out.println(a);
	});
	System.out.println("traversing el;ements through iterator interfac");
	Iterator itr = list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println(itr.hasNext());
	}
}
