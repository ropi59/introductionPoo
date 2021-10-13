
public class Somme {

	public int nombre1;
	public int nombre2;
	
	public Somme() {
		
	}
	
	public Somme(int nombre1, int nombre2) {
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
	}
	
	public int sum() {
		int somme = nombre1 + nombre2;
		return somme;
	}

	@Override
	public String toString() {
		return "Somme [nombre1=" + nombre1 
				+ ", nombre2=" + nombre2 + "]";
	}
	
	
}
