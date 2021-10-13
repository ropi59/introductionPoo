
public class Run {

	public static void main(String[] args) {
		
//		//instatiation de l'objet vehicule
//		Vehicule v1 = new Vehicule();
//		//attribut du vehicule v1
//		v1.couleur = "Bleue";
//		v1.marque = "Peugeot";
//		v1.modele = "308";
//		v1.prix = 6000;
//		//affichage du vehicule avec ses attributs
//		System.out.println(v1);
//	
//	
//		//utilisation de la methode repeindre pour changer la couleur de la voiture
//		String newColor= "Rouge";
//		v1.repeindre(newColor);
//		System.out.println(v1);
//		
//		Vehicule v2 = new Vehicule("Rouge", "Tesla", "Modele S", 50000);
//		System.out.println(v2);
//		
//		//-------------rectangle-------------------------------------
//		//init objet rectangle
//		double longueur = Toolbox.inputDouble("Saisissez une longueur :");
//		double largeur = Toolbox.inputDouble("Saisissez une largeur :");
//		Rectangle r1 = new Rectangle(longueur, largeur);
//		//calcul de l'aire et du perimetre des objets rectangle
//		double aire = r1.calculAire();
//		double perimetre = r1.calculPerimetre();
//		//affichage des resultats
//		System.out.println("L'aire du rectangle r1 est de : " + aire );
//		System.out.println("Le perimètre du rectangle r1 est de : " + perimetre );
//		
//		//-------------somme-------------------------------------
//		//init objet somme
//		int nombre1 = Toolbox.inputInt("Saisissez un nombre : ");
//		int nombre2 = Toolbox.inputInt("Saisissez un autre nombre : ");
//		Somme s1 = new Somme(nombre1, nombre2);
//		//calcul de la somme
//		int somme = s1.sum();
//		//affichage du resultat
//		System.out.println("La somme des deux nombres est de : " + somme);
//		
//		//-------------etudiant-------------------------------------
//		//init objet student
//		Student st1 = new Student("toto", 10, 10, 10, 20, 20, 20);
//		System.out.println(st1);
//		
//		//-------------addiction complexe-------------------------------------
//		System.out.println("premier nombre");
//		int reel1 = Toolbox.inputInt("Saisissez un nombre réel :");
//		int imaginaire1 = Toolbox.inputInt("Saisissez un nombre imaginaire :");
//		System.out.println("deuxieme nombre");
//		int reel2 = Toolbox.inputInt("Saisissez un nombre réel :");
//		int imaginaire2 = Toolbox.inputInt("Saisissez un nombre imaginaire :");
//		AdditionComplex ac1 = new AdditionComplex(reel1, imaginaire1, reel2, imaginaire2);
//		//calcul
//		int sommeReel = ac1.sommeReel();
//		int sommeImaginaire = ac1.sommeImaginaire();
//		//affichage du resultat
//		System.out.println("La somme est " + sommeReel + " + " + sommeImaginaire+"i");
//		
//		//-------------point-------------------------------------
		//attribution des coordonées des points
		Point p1 = new Point(5, 6);
		Point p2 = new Point(3, 2);
		//calcul de la distance
		double distance = p2.distance(p1);
		//affichage
		System.out.println("La distance entre p1 et p2 est de : " + distance);
		
		//-------------etudiant2-------------------------------------
		//creation d'un etudiant
		Student1 s1 = new Student1(25);
		System.out.println(s1);
		s1.presentation();
		s1.goToClasses();
		s1.displayAge();
		//creation d'un professeur
		Teacher t1 = new Teacher(40);
		System.out.println(t1);
		t1.presentation();
		t1.explain();
	}
}
