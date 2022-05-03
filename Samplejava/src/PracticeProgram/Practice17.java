/*How to remove duplicate elements from ArrayList in java?
Write a java program to remove duplicate elements from already constructed ArrayList.*/
package PracticeProgram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import ArrayListPrograms.Arralist3;

public class Practice17 {

	public static void main(String[] args) {
		ArrayList <String>list=new ArrayList<String>();
		list.add("Kajal");
		list.add("Kajal");
		list.add("Vishal");
		System.out.println("List size is"+list.size());
		System.out.println("List elements are"+list);
	 Set<String>s=new HashSet<String>(list); 
		System.out.println(s);
}
}