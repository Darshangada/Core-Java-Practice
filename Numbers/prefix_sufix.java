package Numbers;

public class prefix_sufix {
	public static final int a=6;
	public static  void m1() {
		System.out.println(a);
	}
	public static final void m1(int a,int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
	
	m1();
	m1(12,43);
	}
	
}
class child extends prefix_sufix{
	public static void m1()
{
		System.out.println(21-43);
		}
}
