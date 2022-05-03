package Pattern;

public class Pattern4 {

	public static void main(String[] args) {
int i,j;
for(i=0;i<6;i++)
{
	for(j=6-i;j>=0;j--)

{
	System.out.print(" ");
}
	for(j=1;j<=i;j++)
	{
		System.out.print(" "+j);

	}
System.out.println();
}
}
}