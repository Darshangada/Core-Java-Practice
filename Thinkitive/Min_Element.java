package Thinkitive;

public class Min_Element {

	public static void main(String[] args) {
		int arr[]= {12,43,64,23,76,33,87,12,67,9,98,35,70};
		
		int MinElement=arr[0];
		int max=0;
		int secondmax=0;
		int Thirdmax=0;
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				if(secondmax < max)
				Thirdmax=secondmax;
				secondmax=max;
				max=arr[i];
			}
		}
		System.out.println(secondmax);
		System.out.println(Thirdmax);
		
	}
}
