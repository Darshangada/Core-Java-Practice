package Class;

 class Example {
    private static int staticVariable;
    private int instanceVariable;

    public void instanceMethod() {
        // Accessing and modifying static variable within an instance method
        staticVariable++;
        System.out.println("Static variable value: " + staticVariable);

        // Accessing instance variable
        instanceVariable++;
        System.out.println("Instance variable value: " + instanceVariable);
    }
}
public class Demo1 {

	public static void main(String[] args) {
		Example obj=new Example();	
		obj.instanceMethod();
	}
}
