package Class;


public class Inheritence{
	static int count=0;
	
	Inheritence(){
		count++;
	}
	static void m1() {
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Inheritence obj1=new Inheritence();
		Inheritence obj2=new Inheritence();
		Inheritence obj3=new Inheritence();
		Inheritence obj4=new Inheritence();
		Inheritence obj5=new Inheritence();
		m1();
	}
}
