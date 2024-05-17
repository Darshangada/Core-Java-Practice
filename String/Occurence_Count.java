package String;

public class Occurence_Count {
	
	static void count_occurence(String str) {
		String str2=str.trim();
		
		for(int i=0;i<str2.length();i++) {
			int count=0;
			for(int j=0;j<str2.length();j++) {
				if(str2.charAt(i)==str2.charAt(j)) {
					count++;
				}
			}
			boolean dublicate=false;
			for(int k=0;k<i;k++) {
				if(str2.charAt(i)==str2.charAt(k)) {
					dublicate=true;
					break;
				}
			}
			if(!dublicate) {
				System.out.println(str2.charAt(i)+" : "+count);
			}
		}
	}
	
	
	public static void main(String[] args) {
		String str="my name is darshan";
		count_occurence(str);
	}
}
