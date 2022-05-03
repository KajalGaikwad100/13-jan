/*How to count occurrences of each character in a string in java?
Write a java program to count the number of occurrences of each character in a given 
string. For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences 
of each character in this string is E=4, 2=2, v=2, =4, P=1, S=1, a=4, J=5.*/
package PracticeProgram;

/*public class Practice15 {

	public static void main(String[] args) {
String s="Kajal Vishal";
char s1[]=s.toCharArray();

System.out.println("Length of String is"+s.length());
System.out.println("String is  "+s);
int count =0;
for(int i=0;i<=s.length();i++)
{ 
	count=1;
	for(int j=0;j<s.length()-1;j++)
	{
		if(s.charAt(j)==i)
		{

		
		
			count++;
		}
	}
	if(count!=0)
			System.out.println(" "+i+" "+count);
	count=0;
		}
	}

	}
*/
import java.util.HashMap;
public class Practice15
{
private static void characterCount(String inputString)
{
//Creating a HashMap containing char as a key and occurrences as a value

HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

//Converting given string to char array

char[] strArray = inputString.toCharArray();

//checking each char of strArray

for (char c : strArray)
{
if(charCountMap.containsKey(c))
{
//If char 'c' is present in charCountMap, incrementing it's count by 1

charCountMap.put(c, charCountMap.get(c)+1);
}
else
{
//If char 'c' is not present in charCountMap,
//putting 'c' into charCountMap with 1 as it's value

charCountMap.put(c, 1);
}
}

//Printing inputString and charCountMap

System.out.println(inputString+" : "+charCountMap);
}

public static void main(String[] args)
{
characterCount("Java J2EE Java JSP J2EE");

characterCount("All Is Well");

characterCount("Done And Gone");
}
}