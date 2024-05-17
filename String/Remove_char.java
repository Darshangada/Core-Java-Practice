package String;

public class Remove_char {

	public static void main(String[] args) {
		
		String str="Priyanka";
		String str2="";
		
		for(int i=0;i<str.length();i++){
			 boolean duplicate = false;
	            for (int j = 0; j < str2.length(); j++) {
	                if (str.charAt(i) == str2.charAt(j)) {
	                    duplicate = true;
	                    break;
	                }
	            }
	            if (!duplicate) {
	                str2 += str.charAt(i);
	            } 	
		}
		System.out.println(str2);
	}
}
