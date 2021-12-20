package Animal;

public class Dog extends Animals{

	
	
	public static void main(String[] args) {
		
		Dog obj = new Dog();
		System.out.println(obj.designation);
		System.out.println(obj.type);
		obj.does();
	}

}
