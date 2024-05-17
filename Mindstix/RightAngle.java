package Mindstix;

public class RightAngle {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		
		
		for(int sp1=5;sp1<=5;sp1++) {
			System.out.print(" ");
		
		for(int i=1;i<=5;i++) {
			for(int sp=4;sp>=i;sp--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//			* 
//	      * * 
//	    * * * 
//	  * * * * 
//	* * * * * 
		
		
		for(int i=1;i<=5;i++) {
			for(int sp=2;sp<=i;sp++) {
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        * 
		}
	}
}
