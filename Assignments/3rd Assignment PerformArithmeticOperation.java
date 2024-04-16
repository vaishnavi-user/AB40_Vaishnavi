package firstday;
public class PerformArithmeticOperation {
				
		public static void add()
			{
				int a=15;
				int b=10;
				int Sum=a+b;
				System.out.println("addition="+Sum);
			}
		static void sub()
		{
			int a=15;
			int b=10;
			int subtraction=a-b;
			System.out.println("subtraction="+subtraction);
		}
		private static void mul()
		{
			int a=15;
			int b=10;
			int multiplication=a*b;
			System.out.println("multiplication="+multiplication);
		}
		public static void div()
		{
			int a=10;
			int b=5;
			int division=a/b;
			System.out.println("division="+division);
		}
		public static void main(String[] args) {
					add();
					sub();
					mul();
					div();				
				}
}
