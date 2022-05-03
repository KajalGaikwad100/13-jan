package Day1;

public class UnaryOprateor {
int i=5;  //i=5
//System.out.println(i);if u print here it will print i=5

int j=i++; //j=5,i=6 
//System.out.println(i);if u print here it will print i=6

int g=i++;//g=6,i=7   assign the value to i
//System.out.println(i);if u print here it will print i=7
// thats why it show value of i 7

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOprateor U1=new UnaryOprateor();	
System.out.println(U1.i);   //thats why it print value of i to 7
System.out.println(U1.j);
System.out.println(U1.g);


	}

}
