class pallindrom
{
 public static void main(String [] abc)
{
 int num=Integer.parseInt(abc [0]);
 int a=num;
 int rev=0;
 for(;num>0;num/=10)
{
  int rem=num%10;
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
}
}

 