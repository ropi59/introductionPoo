
public class Rectangle {

	public double longueur;
	public double largeur;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double calculAire() {
		double aire = (longueur * largeur);
		return aire;
	}
	
	public double calculPerimetre () {
		double perimetre = ((longueur + largeur)*2);
		return perimetre;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur 
				+ ", largeur=" + largeur + "]";
	}
	
	
}
