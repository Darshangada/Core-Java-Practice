package Thinkitive;

public class Occurences {
	public static void main(String[] args) {
		String str= "My name is sujata";
		str.trim();
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
			
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
				
			}
			  boolean isDuplicate = false;
	            for (int k = 0; k < i; k++) {
	                if (str.charAt(i) == str.charAt(k)) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                System.out.println(str.charAt(i)+" "+count);
	            }
		}
	}
}
