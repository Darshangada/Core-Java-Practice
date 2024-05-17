package Class;

class a1{
	void m1() {
		System.out.println("hi");
	}
}
class b1 extends a1{
	void m1() {
		System.out.println("hi darshan");
	}
	void m2() {
		System.out.println("hello");
	}
}
class c1 extends b1{
	
//	void m1() {
//		System.out.println("hi gadakh");
//	}
//	void m2() {
//		System.out.println("hello darshan");
//	}
			void m3() {
				System.out.println("hey");
			}
}

public class dynamic_Dispatch {
	public static void main(String[] args) {
		a1 obj=new c1();
		b1 obj1=(b1)obj;
		obj1.m1();
		obj1.m2();
		c1 obj2=(c1)obj1;
		obj2.m1();
		obj2.m2();
		obj2.m3();
	
		
	}
}
