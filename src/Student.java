import java.util.ArrayList;
import java.util.List;

public class Student {

	String nom;
	List<Double> notes;
	
	public Student() {
		
	}
	
	public Student(String nom, double... notes){
		this.nom = nom;
		this.notes = new ArrayList<Double>();
		for(double note : notes) {
			this.notes.add(note);
		}
	}
	
	public double calculMoyenne() {
		double result = 0;
		//parcours de la liste notes de note
		for (double note : notes) {
			//ajout des notes a result
			result += note;
		}
		double moyenne = result/(this.notes.size());
		return moyenne;
	}

	@Override
	public String toString() {
		return "Student [nom=" + nom 
				+ ", moyenne=" + this.calculMoyenne() + "]";
	}

	
	
	
}
