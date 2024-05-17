package Numbers;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int number=1000;
	
		
		
		for(int j=1;j<=number;j++) {
			int sum=0;
			int num=j;
		while(num>0) {
			
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
				}
			sum=sum+fact;
			num=num/10;
			}
		if(sum==j) {
		System.out.println("the number are:"+sum);
		}
		}
		
	}
}
