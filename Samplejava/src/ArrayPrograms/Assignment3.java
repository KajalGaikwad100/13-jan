//calculate the frequency of array
package ArrayPrograms;

public class Assignment3 {

	

		
		public static void main(String[] args)
		{
	int num1[]= {1,2,1,3,4,5,3,2,6,7,2,6,7,5};
	//System.out.println("Number of length is"+num1.length);

	int[] visitedarr=new int[num1.length];
	int visited=-1;

	for(int i=0;i<num1.length;i++)
	{
		int count=1;

		for(int j=i+1;j<num1.length;j++)
		{
			if(num1[i]==num1[j])
			{
				count++;
				visitedarr[j]=visited;
			}
		}
		if(visitedarr[i]!=visited)
				{
			visitedarr[i]=count;
		}
	}
	for(int i=0;i<visitedarr.length;i++)
	{
		if(visitedarr[i]!=visited)
		{
			System.out.println("frequency of "+num1[i]+ "    "+visitedarr[i]);
		}
	}
		}

	}
