package packagemember;

public class Member {

	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		Member p1=new Member();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessPublicMembers {

	public static void main(String[] args) {
		
		Member p1=new Member();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
