package ArrayPrograms;

public class Array8 {

	public static void main(String[] args) {
		int [][]num1=new int[3][3];
		
		for(int i=0;i<num1.length;i++) 
		{
			for(int j=0;j<num1[i].length;j++)
			{
				System.out.print(" "+num1[i][j]);
			}
			System.out.println();
			
		num1[0][0]=1;
		num1[0][1]=2;
		num1[0][2]=3;
		num1[1][0]=4;
		num1[1][1]=5;
		num1[1][2]=1;
		num1[2][0]=1;
		num1[2][1]=1;
		num1[2][2]=1;
		
		for( i=0;i<num1.length;i++)
		{
			for(int j=0;j<num1[i].length;j++)
			{
				System.out.print(" " +num1[i][j]);
			}
			System.out.println();

		}
		}
		char[][] copychar= {{'a','b','c'},{'d','r'},{'t','u'}	};
		
	for(int i=0;i<copychar.length;i++)
	{
		for(int j=0;j<copychar[i].length;j++)
		{
			System.out.print(" "+copychar[i][j]);
		}
		System.out.println();

	}

	}
}