package Pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<6;i++)
		{
			for(j=6-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
System.out.println();
	}

}
}