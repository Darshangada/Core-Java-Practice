package Array;

public class ReverseStringArray {
	static String Reverse(int []arr) {
		
		String str[]=new String[arr.length];
		for(int i=0;i<str.length;i++) {
			str[i]=String.valueOf(arr[i]);
		}
		String s2="";
		for(int i=str.length-1;i>=0;i--) {
			s2=s2+str[i];	
		}
		
		return s2;
	}
	
	public static void main(String[] args) {
		int srr[]= {3,30,34,5,9};
		
		String s3=Reverse(srr);
		System.out.println(s3);
		
	}
}
