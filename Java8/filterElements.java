package Java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

import Array.Array;

public class filterElements {

	public static void main(String[] args) {
		
		int arr[]= {10,34,5,76};
		
		int sum=Arrays.stream(arr).reduce(0, Integer::sum);
		System.out.println(sum);
		
		int even[]=Arrays.stream(arr).filter(num-> num%2==0).toArray();
		Arrays.stream(even).forEach(System.out::println);
		
	
	}
}
