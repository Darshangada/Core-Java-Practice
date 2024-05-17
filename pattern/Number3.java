package pattern;

public class Number3 {

	public static void main(String[] args) {
		

	for(int i=1;i<=5;i++) {
		for(int sp=4;sp>=i;sp--) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" "+j);
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++) {
		for(int sp=1;sp<=i;sp++) {
			System.out.print(" ");
		}
		for(int k=2;k<=5;k++) {
			System.out.print(" "+k);
		}
		System.out.println();
	}
	}
}
