package Array;

public class Second_Largest {

	public static void main(String[] args) {
		int arr[]= {12,43,64,23,76,33,87,12,67,9,98,35,70,99};
	
		int number=0;
		int secondLargest=0;
		for(int i=0;i<arr.length;i++) {
				if(number<arr[i]) {
					secondLargest=number;
					number=arr[i];
				}
				else {
					secondLargest=arr[i];
					
				}
			
		}
		System.out.println("second lagest: "+secondLargest);
	}
}
