package firstday;
abstract class threes
{
	abstract void ab3();
	abstract void ab4();
	void con4()
	{
		System.out.println("i'm forth concrete method");
	}
}

abstract class twos extends threes
{
	abstract void abstract_method();
	abstract void ab2();
	static void con3()
	{
	   System.out.println("i'm third concrete method");
	}
	
}
class Multi_inheritance_with_abstract_concrete_class extends twos
{
static void concrete1(){
   System.out.println("im first concrete method");	
}
void concrete2()
{
	System.out.println("i'm second concrete method");
}
@Override
void abstract_method() {
	System.out.println("i'm 1 abstract method");
	
}
@Override
void ab2() {
	System.out.println("i'm second abstract method");
	
}
@Override
void ab3() {
	
	System.out.println("i'm third abstract method");
}
@Override
void ab4() {
	System.out.println("i'm forth abstract method");
	
}



	public static void main(String[] args) {
		concrete1();
		Multi_inheritance_with_abstract_concrete_class o1=new Multi_inheritance_with_abstract_concrete_class();
		o1.concrete2();
		o1.abstract_method();
		o1.ab2();
		o1.ab3();
		o1.ab4();
		o1.con4();
		

	}

}
