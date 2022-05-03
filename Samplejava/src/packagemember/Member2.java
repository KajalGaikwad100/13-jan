package packagemember;

public class Member2 {

	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		Member2 p1=new Member2();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
