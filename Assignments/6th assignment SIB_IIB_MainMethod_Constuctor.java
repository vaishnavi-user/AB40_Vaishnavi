package firstday;

public class SIB_IIB_MainMethod_Constuctor {
	
	static
	{
		int a=10;
		int b= 20;
		int sum=a+b;
		System.out.println("addition="+sum);
	}
	{
		double c=10.0;
		double d=44.20;
		double sub=d-c;
		System.out.println("subtraction="+sub);
	}
	SIB_IIB_MainMethod_Constuctor()
	{
		System.out.println("i'm constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print main method");
		SIB_IIB_MainMethod_Constuctor T1=new SIB_IIB_MainMethod_Constuctor();
		SIB_IIB_MainMethod_Constuctor T2=new SIB_IIB_MainMethod_Constuctor();
	}

}
