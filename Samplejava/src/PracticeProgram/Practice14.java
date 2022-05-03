//How to perform matrix operations in java?
//Write a java program to perform matrix operations like matrix addition,
//matrix subtraction, matrix multiplication and
//transpose of a matrix.
package PracticeProgram;

public class Practice14 {

	public static void main(String[] args) {
int arr1[][]= {{1,2,3},{1,2,3}};
int arr2[][]= {{5,6,7},{5,6,7}};
for(int i=0;i<arr1.length;i++)
{
	for(int j=1;j<i;j++)
	{
		System.out.print(" "+arr1[i][j]);
		
	}
}System.out.println();
	}

}
