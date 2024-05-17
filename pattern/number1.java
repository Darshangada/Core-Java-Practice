package pattern;

public class number1 {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=5;i++) {
			for(int j=a;j<=i;j++) {
				System.out.print(j+" ");
				a++;
			}
		}
	}
}
