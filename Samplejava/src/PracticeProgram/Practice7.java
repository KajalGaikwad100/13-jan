// How to find duplicate characters in a string in java?
//Write a java program to find duplicate characters and their count in a given string.
//For example, in a string “Better
//Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.
package PracticeProgram;

public class Practice7 {

	public static void main(String[] args) {
		String s="Kajal Vishal Gaikwad";
		System.out.println(s.length());
System.out.println(s);
int count=0;
char s1[]=s.toCharArray();
System.out.println(s1);
System.out.println("Duplicates elements in given string");
for(int i=0;i<s1.length;i++)
{
	count=1;
	for(int j=i+1;j<s1.length;j++)
	{
		if(s1[i]==s1[j] && s1[i]!=' ')
		{
			count++;
			s1[j]='0';
		}
	}
if(count>1 && s1[i]!='0')
{
System.out.println(s1[i]+" "+count);
	
}
}
}
}