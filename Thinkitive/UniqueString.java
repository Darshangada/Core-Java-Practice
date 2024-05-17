package Thinkitive;

public class UniqueString {
	static boolean unique(String str) {

		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					return false;
				}
			}
	
		}
		return true;
	}

	public static void main(String[] args) {
		String str="Hello";
		String str1="kunal";
		
		System.out.println("str is unique? "+unique(str));
		System.out.println("str1 is unique? "+unique(str1));
	}
}
