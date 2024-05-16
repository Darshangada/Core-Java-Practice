import java.util.Scanner;
class Imp23{

void display(int arr[], int size)
{
  for(int i=0;i<size;i++)
{
 System.out.println(arr[i]+" ");
}
}

int[] sortArray(int arr[])
{
int temp=0;
for(int i=0;i<arr.length;i++){

for(int j=0;j<arr.length;j++)
{
 if(arr[i]<arr[j])
{
 temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
}
}}
return arr;
}

int[]funRemove(int arr[],int num){

 int a[]=new int[arr.length-1];
 int count=0;

for(int i=0;i<arr.length;i++)
{
 if(num!=arr[i])
 {
  a[count]=arr[i];
 count++;
}
}
return a;
}


public static void main(String[]arg)
{
 Scanner Sc=new Scanner(System.in);
 System.out.println("enter size of array");
 int size=Sc.nextInt();
 int arr1[]=new int[size];
 System.out.println("enter the element");
 for(int i=0;i<size;i++)

{
  arr1[i]=Sc.nextInt();
}

Imp23 obj=new Imp23();
System.out.println("element of array are");
obj.display(arr1,size);


int arr2[]=obj.sortArray(arr1);
System.out.println("After sorting array");
obj.display(arr2,size);



System.out.println("enter the element whitch you want to remove from array:");
int num=Sc.nextInt();
int[]arr3=obj.funRemove(arr2,num);
obj.display(arr3,size-1);


}}