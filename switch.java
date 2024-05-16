class Switch
{
public static void main (String[] args)
{
 int choice= Integer.parseInt(args[0]);
 switch(choice)
{
case 1: System.out.println("open home page");
break;
case 2: System.out.println("open login page");
break;
case 3: System.out.println("open registration page");
break;

default: System.out.println("Not matching with any choice");

}
System.out.println("Thank you for using app");
}
}

