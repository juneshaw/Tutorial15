class Person {
	String name;
	int age;
	
	// Methods
	void speak() {
		System.out.println("My name is " + name + " and I am " + age + " years old");
	}
	void greeting() {
		System.out.println("Hey there!");
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
public class App {

	public static void main(String[] args) {
		// Create an instance of the object.
		Person person1 = new Person();
		person1.name = "June";
		person1.age = 19;
		
		Person person2 = new Person();
		person2.name = "Jeff";
		person2.age = 18;
		
		System.out.println("Name is: " + person1.getName());
		System.out.println("Age is: " + person1.getAge());
		
		
	}

}