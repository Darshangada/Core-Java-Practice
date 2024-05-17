package Thinkitive;

public class SumIsEqual_ToNumber {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		int number=7;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((arr[i]+arr[j])==number) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
