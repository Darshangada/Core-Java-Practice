package Class;

interface animal{
	
	void m1();
}
class animal1 implements animal{
	public void m1() {
		System.out.println("all Animal are not same");
	}
}

class Dog extends animal1{
	public void m1() {
		System.out.println("Dog is honest animal");
	}
}

public class variable {
    public static void main(String[] args) {
        animal obj = new Dog();
        if (obj instanceof animal1) {
            animal1 animalObj = (animal1) obj;
            animalObj.m1();
        }
    }
}
