package Stringprogram;

public class StringBuilder5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb5=new StringBuilder("My name is kajal");

System.out.println(sb5);
sb5.append("a");
System.out.println(sb5);
sb5.length();
System.out.println(sb5.length());
sb5.replace(1, 8, "Vishal");
System.out.println(sb5);
sb5.capacity();
System.out.println(sb5);
sb5.reverse();
System.out.println(sb5);
sb5.substring(5);
System.out.println(sb5);
sb5.deleteCharAt(10);
System.out.println(sb5);

	}

}
