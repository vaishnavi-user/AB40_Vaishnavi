package firstday;

public class CallStatic_NonStatic_Constructor_Method {
	
	static void add()
	{
		int a=20;
		int b=5;
		int sum=a+b;
		System.out.println("addition="+sum);
	}
	static void sub()
	{
		int a=20;
		int b=5;
		int sub=a-b;
		System.out.println("subtraction="+sub);
	}
	static void mul()
	{
		int a=20;
		int b=5;
		int mul=a*b;
		System.out.println("multi="+mul);
	}
	static void div()
	{
		int a=20;
		int b=10;
		int div=a/b;
		System.out.println("divsision="+div);
	}
static void mod()
{
	int a=20;
	int b=10;
	int mod=a%b;
	System.out.println("modulus="+mod);
}
void addi()
{
	int a=20;
	int b=5;
	int sum=a+b;
	System.out.println("addition="+sum);
}
void subt()
{
	int a=20;
	int b=5;
	int sub=a-b;
	System.out.println("subtraction="+sub);
}
void multi()
{
	int a=20;
	int b=5;
	int mul=a*b;
	System.out.println("multi="+mul);
}
void divi()
{
	int a=20;
	int b=10;
	int div=a/b;
	System.out.println("divsisionn="+div);
}
void modulus()
{
int a=20;
int b=10;
int mod=a%b;
System.out.println("modulus="+mod);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallStatic_NonStatic_Constructor_Method C1= new CallStatic_NonStatic_Constructor_Method();
		add();
		sub();
		mul();
		div();
		mod();
		//
		C1.addi();
		C1.subt();
		C1.multi();
		C1.divi();
		C1.modulus();
		
		
		}

}
