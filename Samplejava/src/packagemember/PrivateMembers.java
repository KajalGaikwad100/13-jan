package packagemember;

public class PrivateMembers {

	private int accNum=12345;
	private void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/*class AccessPrivateMembers2 {// cant access the private member outside the class

	public static void main(String[] args) {
		
	PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}*/