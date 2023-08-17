package String;

import java.util.Scanner;

public class CheckStringPolyndrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String....");
		
		String str=sc.nextLine();
		
		boolean rs=isPalindrome(str);
		if(rs)
			System.out.println("String is a palindrome");
		else
			System.out.println("String is not palindrome");
		
	}
	
	static boolean isPalindrome(String str)
	{
		int i=0,j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				
				return false;
				i++;
			    j--;
		}
		return true;
	}

}
