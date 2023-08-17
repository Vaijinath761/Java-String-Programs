package String;

import java.util.Scanner;

public class ConvertLowerCase {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String....");
		
		String str=sc.nextLine();
		String rs;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)((char)ch+32);
			rs=rs+ch;
			}
		}
		
		System.out.println(rs);

	}*/
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String....");
		
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		str=new String(ch);
		System.out.println(str);
	}

}
