
//Define a method to count howmany words present in the sentence

package String;

import java.util.Scanner;

public class CountWords 
{

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String....");
			
			String str=sc.nextLine();
			int wc=countWords(str);
			System.out.println("Number of words: "+wc);
	}
	
	static int countWords(String str)
	{
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}
		return count;
	}

}
