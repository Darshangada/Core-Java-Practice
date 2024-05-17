package Thinkitive;

import java.io.CharArrayReader;

import String.remove_dubicatewords;

public class Reverse_Without_SreingFinction {

	static String Reverse(String str) {
		
		str.trim();

		char [] chararr=str.toCharArray();
		
		int start=0;
		int end=str.length()-1;
		
		while(start<end) {
			char temp=chararr[start];
			chararr[start]=chararr[end];
			chararr[end]=temp;
			
			start++;
			end--;
		}
		
		return new String(chararr);
	}
	public static void main(String[] args) {

		String str="Darshan";
		String s2=Reverse(str);
		System.out.println(s2);
	}
}
