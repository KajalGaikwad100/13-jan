package ArrayPrograms;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] copyfrom= {'a','b','c','d','e','f','g','h','i','j','k'};

char[] copyto=new char[5];
System.arraycopy(copyfrom, 5, copyto, 0,copyto.length);
for(int i=0;i<copyto.length;i++)
{
	System.out.println(copyto[i]);
}
	}

}/*
char[] copyfrom= {'a','b','c','d','e','f','g','h','i','j','k'};
 char[] copyto=new char[5];
 System.arraycopy(copyfrom,5,copyto,0,copyto.length);
 
 for(int i=0;i<copyto.length;i++)
 {
	 System.out.println(copyto[i]);
 }*/