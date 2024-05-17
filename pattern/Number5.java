package pattern;

public class Number5 {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
		
//	        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 1};
//	        
//	        // Print the original array
//	        System.out.println("Original array:");
//	        for (int num : array) {
//	            System.out.print(num + " ");
//	        }
//	        System.out.println();
//	        
//	        // Remove duplicates
//	        int length = array.length;
//	        for (int i = 0; i < length; i++) {
//	            for (int j = i + 1; j < length; j++) {
//	                if (array[i] == 3.[j]) {
//	                    // Shift elements to the left
//	                    for (int k = j; k < length - 1; k++) {
//	                        array[k] = array[k + 1];
//	                    }
//	                    length--; // Decrease array length
//	                    j--; // Adjust the index to recheck the shifted element
//	                }
//	            }
//	        }
//	        
//	        // Print the array without duplicates
//	        System.out.println("Array after removing duplicates:");
//	        for (int i = 0; i < length; i++) {
//	            System.out.print(array[i] + " ");
//	        }
//	        System.out.println();
	    
	}
}
