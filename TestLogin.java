class Login
{
public static boolean getLogin(int userId, String password)
{
if(userId==12345 && password.equals("cyber"))
{
return true;
}
return false;

}
public String getMsg()
{

return "Hi";
}

}

class TestLogin
{
public void printMsg()
{
Login login=new Login();
  String m= login.getMsg();
System.out.println(m);
}

public static void main(String[] args)
{
boolean status=Login.getLogin(12345, "cyber");
if(status)
{
System.out.println("Login succesS");
}
else
{
System.out.println("login failed");
}

TestLogin login=new TestLogin();
   login.printMsg();
}
}