package Stringprogram;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb1=new StringBuffer("Kajal ");
System.out.println(sb1);
sb1.append("Gaikwad");
System.out.println(sb1);
sb1.insert(6, "Vishal");
System.out.println(sb1);
sb1.replace(1, 5, "Vishu");
System.out.println(sb1);
sb1.reverse();
System.out.println(sb1);
sb1.delete(1, 5);
System.out.println(sb1);

StringBuffer sb4=new StringBuffer("Bangalore is known for gardwn city");
System.out.println(sb4);
sb4.append("Divya");
System.out.println(sb4);
	}

}
