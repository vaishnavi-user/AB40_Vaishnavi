package firstday;

import java.util.Scanner;

public class Switch_case_with_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=S1.nextInt();
		System.out.println("enter the value of b");
		int b=S1.nextInt();
		System.out.println("please enter the choice : ");
		int choice=S1.nextInt();
		switch(choice)
		{
		case 1: 
			int sum =a+b;
			System.out.println("add = "+sum);
			
		
		break;
		
			case 2:
				int sub;
				sub=a-b;
				System.out.println("sub = "+sub);
			
		
		break;
		
		case 3:  
			int mul; 
			mul=a*b;
			System.out.println("mul = "+mul);
			
	
		break;
		
		case 4: 
			double div;
			div=a/b;
			System.out.println("div = "+div);
		S1.close();
		
	}
	}
}
