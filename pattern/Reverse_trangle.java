package pattern;

public class Reverse_trangle {

	
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int sp=5;sp>0;sp--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
