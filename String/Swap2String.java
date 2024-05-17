package String;

public class Swap2String {

//	public static void main(String[] args) {
//		String s1="Good morning";
//		String s2="Hi kunal";
//		
//		s1=s1+s2;
//		s2=s1.substring(0,s1.length()-s2.length());
//		s1=s1.substring(s2.length());
//		System.out.println(s1);
//		System.out.println(s2);
//		
//	}
	
//	 public static void main(String[] args) {
//	        int n = 5; // Change this value to adjust the size of the butterfly pattern
//	        printButterfly(n);
//	    }

//	    public static void printButterfly(int n) {
//	        // Upper part of the butterfly
//	        for (int i = 1; i <= n; i++) {
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("* ");
//	            }
//	            int spaces = 2 * (n - i);
//	            for (int j = 1; j <= spaces; j++) {
//	                System.out.print("  ");
//	            }
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        }
//
//	        // Lower part of the butterfly
//	        for (int i = n; i >= 1; i--) {
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("* ");
//	            }
//	            int spaces = 2 * (n - i);
//	            for (int j = 1; j <= spaces; j++) {
//	                System.out.print("  ");
//	            }
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        }
//	    }
	public static void main(String[] args) {
        int n = 5; // Change the value of n to adjust the size of the pattern

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
