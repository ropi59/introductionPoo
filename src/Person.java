
public class Person {

	//variables
	int age;
	
	//constructeur vide
	public Person() {
		
	}
	
	//constructeur
	public Person(int age) {
		this.age = age;
	}

	//getters setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//methode presentation
	public void presentation() {
		System.out.println("Hello ");
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
}
