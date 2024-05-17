package Thinkitive;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int sp=i;sp<2;sp++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
