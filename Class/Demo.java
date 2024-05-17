package Class;

class A{
	 static void m1() {
			System.out.println(111);
//			m2();
			System.out.println(222);
		}
	 
	 void m2() {
		 System.out.println(333);
	 }
}
public class Demo {

	public static void main(String[] args) {
		
		A aa= new A();
		aa.m1();
		
	}
}
