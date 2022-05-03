package ArrayPrograms;

public class Multiarray {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{1,2,3}};
		System.out.println(arr.length);
		System.out.println("*******************************");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
			}

}
