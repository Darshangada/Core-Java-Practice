package pattern;

public class Number4 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int a=1;
			for(int sp=1;sp<=i;sp++) {
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}
