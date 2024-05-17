package Class;

public class variable2 {

	static int cw=10;
	
	public static void main(String[] args) {
		variable2 obj=new variable2();
		variable2 obj1= new variable2();
		obj.cw +=cw;
		
		System.out.println(obj.cw+obj1.cw);
	}
}
