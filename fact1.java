class fact1
{
 public static void main(String[] abc)
{

int num=Integer.parseInt(abc[0]);
int fact=1;
 for(int i=1;i<=num;i++)
{
 fact=fact*i;
 System.out.println("factorial is:  "+fact);
}
}
}