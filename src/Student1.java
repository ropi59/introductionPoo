
public class Student1 extends Person {

	//constructeur vide
	public Student1() {
		
	}
	//constructeur
	public Student1(int age) {
		super.age = age;
	}
	
	//methodes
	public void goToClasses() {
		System.out.println("I'm going to class");
	}
	
	public void displayAge() {
		super.age = age;
		System.out.println("My age is " + super.age);
	}

	@Override
	public String toString() {
		return "Student1 [age=" + age + ", getAge()=" + getAge() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass()  + "]";
	}
}
