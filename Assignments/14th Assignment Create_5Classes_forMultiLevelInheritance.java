package firstday;
class four
{
	void div()
	{
		int a=10;
		int b= 5;
		int div =a/b;
		System.out.println("div= "+div);
	}
}

class three extends four
{
	void mul()
	{
		int a=5;
		int b=5;
		int multi=a*b;
		System.out.println("mul= "+multi);
	}
}

class two extends three
{
	 void sub()
	{
		int a=15;
		int b=5;
		int sub = a-b;
		System.out.println("sub= "+sub);
	}
}
class one extends two
{
	 void add()
	{
		int a=10;
		int b=20;
		int sum;
		sum=a+b;
		System.out.println("addition = "+sum);
	}
}
	public class Create_5Classes_forMultiLevelInheritance{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one o1=new one();
		o1.div();
		o1.mul();
		o1.sub();
		o1.add();
	}

}
