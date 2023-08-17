package String;

import java.util.Scanner;

public class StringEx1 {

	/*public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String....");
		
		String str=sc.nextLine();
		
		int uc=0,lc=0,dc=0,spc=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				uc++;
			else if(ch>='a'&&ch<='z')
				lc++;
			else if(ch>='0'&&ch<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("Number of Capital letters: "+uc);
		System.out.println("Number of Small letters: "+lc);
		System.out.println("Number of digits letters: "+dc);
		System.out.println("Number of special characters: "+spc);

	}*/
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String....");
		
		String str=sc.nextLine();
		
		int uc=0,lc=0,dc=0,spc=0;
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]>='A'&&ch[i]<'Z')
				uc++;
			else if(ch[i]>='a'&&ch[i]<'z')
				lc++;
			else if(ch[i]>='0'&&ch[i]<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("Number of Capital letters: "+uc);
		System.out.println("Number of Small letters: "+lc);
		System.out.println("Number of digits letters: "+dc);
		System.out.println("Number of special characters: "+spc);

	}

}
