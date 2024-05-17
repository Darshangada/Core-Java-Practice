package pattern;

public class number {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int sp=i;sp<=4;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
