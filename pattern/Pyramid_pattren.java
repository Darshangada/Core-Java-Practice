package pattern;

public class Pyramid_pattren {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
					System.out.print("*");	
			}
			for(int g=1;g<=i;g++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
