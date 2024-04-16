package firstday;

import java.util.Scanner;

public class Palindrome_with_scanner {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		System.out.println("print any name:");
		String name= S1.next();
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		if (name.equals(reverse))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not a palindrome");
		}
		
		S1.close();
	}
}



