package String;

import java.util.ArrayList;

public class find_permutation {

	
	public static void main(String[] args) {
		String s1="aab";
		String s2="aaaab";
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list1=new ArrayList<String>();
		for(int i=0;i<s1.length();i++) {
			String s3="";
			for(int j=i;j<s1.length();j++) {
				
				for(int k=i;k<j+1;k++) {
					
					s3+=s1.charAt(k);
					list.add(s3);
				}	
			}	
		}
		for(int i=0;i<s2.length();i++) {
			
			for(int j=i;j<s2.length();j++) {
				String s3="";
				for(int k=i;k<j+1;k++) {
					s3+=s2.charAt(k);
					list1.add(s3);
				}	
			}	
		}
		System.out.println(list);
	}
}
