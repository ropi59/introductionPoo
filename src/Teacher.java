
public class Teacher extends Person {

	//variable private
	private String subject;
	
	//constructeur vide
	public Teacher() {
		
	}
	
	//constructeur
	public Teacher(int age) {
		super.age = age;
	}
	
	//getters setters
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	//methode
	public void explain() {
		System.out.println("Explanation begins");
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", "
				+ "age=" + age + ", "
						+ "getAge()=" + getAge() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
}
