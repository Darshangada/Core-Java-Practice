package Class;

class Demo6{
	
	void m1() {
		System.out.println("M1 method is called");
	}

	public static Demo1 createInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Ways_To_CreateObject {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
//		Demo object1=new Demo();
//		object1.m1();
		
		System.out.println("****************************");
		
	//	Demo1 object2 = Demo1.createInstance();
	//	System.out.println(object2);
		System.out.println("*********************************");
		
		Demo obj = (Demo) Class.forName("Class.Demo").newInstance();
		System.out.println("new "+obj);
		
	}
}
