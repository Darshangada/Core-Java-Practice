package Class;

public class Smallest_element {
	
	int SmallElement( int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		int array[]= {12,4,54,32,65,76,342,65,9};
		
		Smallest_element obj=new Smallest_element();
		int min=obj.SmallElement(array);
		
		System.out.println("Min element in array: "+min);
	}
}
