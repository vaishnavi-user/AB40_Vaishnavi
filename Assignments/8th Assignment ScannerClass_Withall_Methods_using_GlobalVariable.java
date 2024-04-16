package firstday;

import java.util.Scanner;

public class ScannerClass_Withall_Methods_using_GlobalVariable {
	
	static int a,b,Result;
	
	void add()
	{
		Result=a+b;
		System.out.println("addition of two number ="+Result);
	}
	void sub()
	{
		Result=a-b;
		System.out.println("subtraction of two number ="+Result);
	}
	void mul()
	{
		Result=a*b;
		System.out.println("multiplication of two number ="+Result);
	}
	void div()
	{
		Result=a/b;
		System.out.println("division of two number ="+Result);
	}
	void mod()
	{
		Result=a%b;
		System.out.println("modulus of two number ="+Result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S1=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=S1.nextInt();
		System.out.println("enter the value of b");
		b=S1.nextInt();
		ScannerClass_Withall_Methods_using_GlobalVariable G1=new ScannerClass_Withall_Methods_using_GlobalVariable();
		G1.add();
		G1.sub();
		G1.mul();
		G1.div();
		G1.mod();
		
	}
}
