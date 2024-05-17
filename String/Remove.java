package String;

import java.util.Arrays;

import Array.Duplicate_remove;

public class Remove {
//	void Display(String s1) {
//		for(int i=0;i<s1.length();i++) {
//			System.out.print(s1.charAt(i));
//		}
//		
//	}
//	
	static void Duplicate_remove(String s1) {
		
		String s2[]=s1.split(" ");
		
		Arrays.sort(s2);
		
		for(int i=0;i<s2.length-1;i++) {
			
			if(!s2[i].equalsIgnoreCase(s2[i+1])) {
				System.out.print(s2[i]+" ");
			}
		}
		System.out.println(s2[s2.length-1]);
		
	}

	public static void main(String[] args) {
		String s1="java server page it os a server side tech for developint server";
		
		Duplicate_remove(s1);
	}
}
