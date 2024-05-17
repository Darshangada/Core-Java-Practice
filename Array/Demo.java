package Array;


	import java.util.Scanner;

	public class Demo {
	    
	    void display(char arr[]){
	        for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i]+" ");
	        }
	    }
	    char[] remove(char arr[], char element) {
	        char[] a = new char[arr.length ];
	        int count = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != element) {
	                a[count] = arr[i];
	                count++;
	            }
	        }
	        return a;
	    }

	    char[] add(char arr[], char elements){
	        char b[] =new char[arr.length];
	      
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]!=elements){
	                b[i]=arr[i];
	                b[arr.length-1]=elements;
	            }     
	        }
	            return b;   
	    }   
	    


	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of array:  ");
	        int size=sc.nextInt();

	        char arr[]= new char[size];
	        System.out.println("enter the elements in aarray:   ");
	        for(int i=0;i<size;i++){
	            arr[i]=sc.next().charAt(0);       
	        }

	        Demo obj=new Demo();    
	        System.out.println("display the charcters:  ");
	        obj.display(arr);
	        System.out.println();

	        System.out.println("Enter elements to remove in array:  ");
	        char element=sc.next().charAt(0);
	        char [] arr1=obj.remove(arr,element);
	        obj.display(arr1);

	        System.out.println();
	        System.out.println("enter elements to add in array:  ");
	        char elements=sc.next().charAt(0);
	        char[] arr2=obj.add(arr1,elements);
	        obj.display(arr2);

	    }
	}
