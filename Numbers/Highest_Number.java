package Numbers;

public class Highest_Number {

	public static void main(String[] args) {
		
		int arr[]= {12,56,87,32,76,19,53,94,76,53,};
		
		int highest=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>highest) {
				highest=arr[i];
			}
		}
		System.out.println(highest);
	}
}
