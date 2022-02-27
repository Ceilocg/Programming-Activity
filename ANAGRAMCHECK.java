package demo;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ANAGRAMCHECK {
	
	// Approach 1 - Using Arrays
    public static boolean isAnagram(String str1, String str2)
    {
    	if(str1.length() != str2.length())
    		return false;
    	else
    	{
    		char[] str1Array = str1.toCharArray();
    		char[] str2Array = str2.toCharArray();
    		
    		Arrays.sort(str1Array);
    		Arrays.sort(str2Array);
    		
    		Arrays.sort(str1Array);
    	}
		return false;
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter string 1 : ");
		String str1 = sc.nextLine();
		
		System.out.print("Please enter string 2 : ");
		String str2 = sc.nextLine();
		
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if (isAnagram(str1, str2))
			System.out.print("Strings : " + str1 +" and " + str2 +" are Anagrams");
		else 
			System.out.print("Strings : " + str1 +" and " + str2 +" are NOT Anagrams");
		

	}

}
