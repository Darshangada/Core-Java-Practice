package Array;

import java.util.Scanner;

public class Demo1 {
	void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	int max_value(int arr[]) {
	    int buy_price = arr[0];
	    int max_profit = 0;

	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > buy_price) {
	            int profit = arr[i] - buy_price;
	            if (profit > max_profit) {
	                max_profit = profit;
	            }
	        } else {
	            buy_price = arr[i];
	        }
	    }
	    return max_profit;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter element in array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Display All element: ");
		Demo1 obj=new Demo1();
		obj.display(arr);
		System.out.println();
		System.out.println("Profit of stock:");
		int profite=obj.max_value(arr);
		System.err.println(profite);

	}

}
