package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force >= 0 : "La force d'un Romain doit être positive";
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}

	private String prendreParole() {
		return "Le romain " + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {
		int forceAvant = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force < forceAvant : "La force du Romain n'a pas diminué après avoir reçu un coup";

	}

	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		minus.parler("Salut");
	}
}
