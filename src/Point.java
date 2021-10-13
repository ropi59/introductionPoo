
public class Point {

	//variables
	double x;
	double y;
	
	//constructeur par defaut
	public Point() {
		
	}
	
	//constructeur
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public double distance(Point point) {
		double result = Math.sqrt(Math.pow((point.x - this.x), 2)+ Math.pow((point.y - this.y), 2));
		return result;
	}
}
