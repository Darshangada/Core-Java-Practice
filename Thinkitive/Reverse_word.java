package Thinkitive;

public class Reverse_word {

	public static void main(String[] args) {
		String str1="My name is Darshan";
		str1.trim();
		String str2[]=str1.split(" ");
	String str3="";
		for(int i=str2.length-1;i>=0;i--) {
//			System.out.print(str2[i]+" ");
			str3=str3+str2[i]+" ";
		}
		System.out.println(str3);
	}
}