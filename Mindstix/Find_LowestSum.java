package Mindstix;

public class Find_LowestSum {
	
	static void minSum(int arr[]) {
		int lowest=arr[0];
		int second_lowest=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>lowest) {
				second_lowest=lowest;
				lowest=arr[i];
			}
			else {
				second_lowest=arr[i];
			}
		}
		System.out.println(lowest+" "+second_lowest);
		System.out.println(lowest+second_lowest);
	}

	
	public static void main(String[] args) {
		int arr[]= {13,54,53,22,5,7,87,2,76};
		minSum(arr);
	}
}
