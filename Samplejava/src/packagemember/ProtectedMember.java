package packagemember;

public class ProtectedMember {

	protected int accNum=12345;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		ProtectedMember p1=new ProtectedMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessProtectedMembers {

	public static void main(String[] args) {
		
		ProtectedMember p1=new ProtectedMember();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}