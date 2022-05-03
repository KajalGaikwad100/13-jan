package Wrapperclass;

public class Wrapperclass2 {
		public static void main(String[] args) {
			
			char c1='A';
			
			Character charObj1=new Character(c1);// boxing
			System.out.println(c1==charObj1);
			Character charObj2=new Character('Z');
			
			Character charObj3='H';// boxing
			
			System.out.println("c1: "+c1);
			System.out.println("charObj1: "+charObj1);
			System.out.println("charObj2: "+charObj2);
			System.out.println("charObj3: "+charObj3);
			
			boolean b=true;
			Boolean bObj=new Boolean(b);
			System.out.println(bObj==b);
			System.out.println("***************************************************");
			char c3='B';
			
			Character cobj=new Character(c3);
			System.out.println(c3);
            System.out.println(c3==cobj);
             int i=20;
             Integer iobj=new Integer(i);
             System.out.println(i);
             System.out.println(iobj==i);
             System.out.println("*****************************************************");
             float f=36;
             Float f1=new Float(f);
             System.out.println(f1);
             
		}

	}

