
public class AdditionComplex {

	int reel1;
	int imaginaire1;
	int reel2;
	int imaginaire2;
	
	public AdditionComplex() {
		
	}
	
	public AdditionComplex(int reel1, int imaginaire1, int reel2, int imaginaire2) {
		this.reel1 = reel1;
		this.imaginaire1 = imaginaire1;
		this.reel2 = reel2;
		this.imaginaire2 = imaginaire2;		
	}
	
	public int sommeReel() {
		int sommeReel = this.reel1 + this.reel2;
		return sommeReel; 
	}
	
	public int sommeImaginaire() {
		int sommeImaginaire = this.imaginaire1 + this.imaginaire2;
		return sommeImaginaire; 
	}

	@Override
	public String toString() {
		return "AdditionComplex [reel1=" + reel1 
				+ ", imaginaire1=" + imaginaire1 
				+ ", reel2=" + reel2
				+ ", imaginaire2=" + imaginaire2 + "]";
	}
	
	
}
