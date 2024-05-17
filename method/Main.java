package method;
class abc{
	public void m1()  {
		System.out.println("Hey");
	}
}

class def extends abc{
	public void m1()  {
		System.out.println("Hey darshan");
	}
	public  void m2(){
		System.out.println("Hello world");
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println("Hi");
		abc obj=new def();
		def obj1=(def) obj;
		
		obj1.m1();
		obj1.m2();
	}

	
}
