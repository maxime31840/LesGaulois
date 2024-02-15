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
	
	public void parler(String texte) {
		System.out.println(prendreParole + """ + texte + """);
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " :";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" +nom + ", force=" + force + ", effetPotion="	+ effetPotion + "]";
	}
	
	public static void main(String[] args) {
		
	}

  
}
