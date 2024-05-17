package Numbers;

public class Prime_Number {

	public static void main(String[] args) {
		int num=47;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
	
			}
		}
		if(count==0) {
			System.out.println("The given number is prime");
		}
		else {
			System.out.println("The given number is not prime");
		}
	}
}
