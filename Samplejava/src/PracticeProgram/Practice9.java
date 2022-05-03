/* Anagram program in java
Write a java program to check whether two given strings are anagram or not. 
Two strings are said to be anagram if they
contain same set of characters but in different order. For example, “Mother In Law” and
“Hitler Woman” are anagrams.   */
package PracticeProgram;

import java.util.Arrays;

public class Practice9 {
	static void isAnagram(String str1,String str2)
	{
	String s1=str1.replaceAll("\\S"," ");
	String s2=str2.replaceAll("\\S"," ");
	
	boolean status=true;
	if(s1.length()!= s2.length())
	{
		status=false;
	}
	else
	{
		char array1[]=s1.toLowerCase().toCharArray();
		char array2[]=s2.toLowerCase().toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		status=Arrays.equals(array1, array2);
	}
	if(status)
	{
		System.out.println(s1+" And"+s2 +"Are anagrams");;
	}
	else
	{
		System.out.println(s1+" And"+s2 +"Are  not anagrams");;

	}
	}
	public static void main(String[] args) {
	isAnagram("keep","peek");
}
}