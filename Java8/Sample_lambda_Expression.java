package Java8;

interface functional{
	
	void test(int a,int b,String name);
}

public class Sample_lambda_Expression {

	public static void main(String[] args) {
		 functional fun=(a,b,c)->{
		 System.out.println("My name is darshan");
		 System.out.println(a+b);
		 System.out.println(b-a);
		 System.out.println(c);
		 };
		 fun.test(90,87,"kunal");
	}
}
