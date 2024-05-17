package String;

import java.util.Arrays;

public class remove_dubicatewords {

	public static void main(String[] args) {
		String s1="Hi my name is darshan, is shi's  name is sujata";
		String []s2=s1.split(" ");
		Arrays.sort(s2);
		for(int i=0;i<s2.length-1;i++) {
			
			if(!s2[i].equalsIgnoreCase(s2[i+1])) {
				System.out.print(s2[i]+" ");
			}
		}
		System.out.print(s2[s2.length-1]);
	}
}
