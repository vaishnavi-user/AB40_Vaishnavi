package firstday;

import java.util.Scanner;

public class CircumferenceOfCircle {
	final static double pi=3.14;
	void circumference()
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("enter the radius");
		int r=S1.nextInt();
		double Circumference_Of_Circle =2*pi*r;
		System.out.println("Circumference_Of_Circle= "+Circumference_Of_Circle);
		S1.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircumferenceOfCircle C1=new CircumferenceOfCircle();
		C1.circumference();
		}

}
