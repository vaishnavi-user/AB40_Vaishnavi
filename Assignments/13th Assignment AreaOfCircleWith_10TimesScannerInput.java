package firstday;

import java.util.Scanner;

public class AreaOfCircleWith_10TimesScannerInput {
	final static double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
		   System.out.println("enter the value of radius");
		   int r=S1.nextInt();
		   double area_of_circle=pi*r*r;
		   System.out.println("area of circle= "+area_of_circle);
		   
		}
		S1.close();
	}

}
