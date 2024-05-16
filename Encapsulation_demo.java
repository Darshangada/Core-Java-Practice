class User{
	private int id;
	private String firstname;
	private String lastname;


	public int getId(){
	
	return id;
	  
   }

	public String getFirstname(){
	
	return firstname;
	  
   }

	public String getLastname(){
	
	return lastname;
	  
   }

	public void setId(int id){
	
	this.id=id;
	  
   }
	public void setFirstname(String firstname){
	
	this.firstname=firstname;
	  
   }
	public void setLastname(String lastname){
	
	this.lastname=lastname;
	  
   }
}

class Encapsulation_demo{

	public static void main(String [] args){
	
	User ob=new User();
	ob.setId(10);
	ob.setFirstname("Kunal");
	ob.setLastname("Pawar");

	System.out.println("id:  "+ob.getId());
	System.out.println("First name:  "+ob.getFirstname());
	System.out.println("LAst name:  "+ob.getLastname());


}
}