package String;

public class Reverse {

	public static void main(String[] args) {
		String s1="my name is darshan";	
		String s2[]=s1.split(" ");
		System.out.println();
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}
	}
}
