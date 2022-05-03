package Day1;

public class StaticGlobalVariable {
	static int age=25;
	int num=10;
	
	
	public static void main(String[] args) {
		
		System.out.println("age"+age);
		age=30;
		System.out.println("age"+age);
		
		
		StaticGlobalVariable n1=new StaticGlobalVariable();
		System.out.println(n1.num);
		n1.num=20;
		System.out.println(n1.num);

		
		

	}

}
