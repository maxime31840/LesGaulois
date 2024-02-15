package personnages;

public class Gaulois {
	private string nom;
	private int force;
	private int EffetPotion=1;
	
	public Gaulois(string nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public string getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" +nom + ", force=" + force + ", effetPotion="	+ effetPotion + "]";
	}
	
	public static void main(String[] args) {
		
	}

  
}
