package firstday;

public class Create_5constructor {
	
	Create_5constructor(int a,int b)
	{
	System.out.println("sum ="+(a+b));
	}
	Create_5constructor(char ch)
	{
		System.out.println("character = "+ch);
	}
	Create_5constructor(String str,String a)
	{
		System.out.println("my name is = "+(str + a));
	}
	Create_5constructor(boolean True)
	{
		System.out.println("sky is blue? = "+True);
	}
	Create_5constructor(int q,boolean r,char ch,String s)
	{
		System.out.println(q);
		System.out.println(r);
		System.out.println(ch);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Create_5constructor(5,10);
		new Create_5constructor('a');
		new Create_5constructor("vaishnavi","kadam");
		new Create_5constructor(true);
		new Create_5constructor(50,false,'d',"city");
	}

}
