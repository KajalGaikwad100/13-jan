package ArrayListPrograms;

import java.util.ArrayList;

public class Arraylist7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<String>();
list.add("Vijay");
list.add("Vijaya");
list.add("Vishal");
list.add("Kajal");

System.out.println("Number of list is"+list.size());
System.out.println("List elements is"+list);
System.out.println("Remove particular elements"+list.remove(0));
System.out.println(list);

ArrayList<String>list2= new ArrayList<String>();
list2.add("Amol");
list2.add("Divya");
list2.addAll(list);
System.out.println();
System.out.println(list2);
	}

}
