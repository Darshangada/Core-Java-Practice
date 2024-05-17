package Thinkitive;

public class RemoveDublicateElement {

	public static void main(String[] args) {
		
		int arr[]= {12, 43,32, 21, 76, 65 ,12, 21};
		int arr2[] = new int[arr.length];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			boolean dublicate=false;
			for(int j=0;j<count;j++) {
				if( arr[i] == arr2[j] ) {
					dublicate=true;
					break;
				}
			}
			if(!dublicate) {
				arr2[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
