package Class;

public class String_Palindrom {

	public static void main(String[] args) {
		String s1="kunal";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		
		if(s2.equals(s1)) {
			System.out.println("String are palindrom: ");
			
		}
		else {
			System.out.println("String are not palindrom: ");
		}
	}
}
