class assignment
{
 public static int checkpalindrom(int number)
{

 int a=number;
 int rev=0;
 for(;number>0;number/=10)
{
  int rem=number%10;
  rev=rev*10+rem;
}
 if(rev==a)
{
 System.out.println("Number ia palindrom");
}
 else
{
 System.out.println("Number ia not palindrom");
}
 return number;
}

public static void main(String [] abc)
{
int number=Integer.parseInt(abc[0]);
checkpalindrom(number);
}
}

