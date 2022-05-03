package CollectionClass;

import java.util.ArrayList;
import java.util.Comparator;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();
list.add("Mango");
list.add(1234);
list.add('A');
list.add(true);
System.out.println("ArrayList is");
System.out.println(list.size());
System.out.println(list);
for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i));
}
System.out.println();
for(Object obj:list)
{
	System.out.println(obj);
}
System.out.println("************************");
list.set(1, "Kajal");
System.out.println(list);
Object list1=new ArrayList();

list1=list.clone();
System.out.println(list1);

System.out.println(list1.equals(list));

System.out.println(list.spliterator());


	}

}
