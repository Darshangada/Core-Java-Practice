package Numbers;

import java.util.Scanner;

public class ArmStrong_number {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(number>0) {
			int rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
		}
		if(sum==temp) {
		System.out.println("number is armstrong ");
		}
		else {
			System.out.println("number is not armstrong ");
		}
	}
}
