package Stringprogram;

public class String1 {

	public static void main(String[] args) {

		String s1="Mumbai";
		String s2="Kolhapur";
		String s3="Bangalore";
		String s4="Mumbai";
		
		System.out.println("S1:"+s1);
		System.out.println("S2:"+s2);
		System.out.println("S3:"+s3);
		System.out.println("S4:"+s4);
		
		System.out.println("Length of s1 is :"+s1.length());
		System.out.println("Length of s2 is :"+s2.length());
		System.out.println("Length of s3 is :"+s3.length());
		System.out.println("Length of s4 is :"+s4.length());

		System.out.println("S1 and S2 using equals:"+s1.equals(s2));
		System.out.println("S1 and S2 using ==:"+s1==s2);
		System.out.println("S1 and S4 using equals:"+s1.equals(s4));
		System.out.println("S1 and S4 using ==:"+s1==s4);
		String s="kajal";
		String temp=" ";
		System.out.println("Length of s is :"+s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
			System.out.println(" "+temp);
		
	}

}
