package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois;
	private Gaulois chef;
	private int nbVillageois;
	private int nbVillageoisMaximum;

	public Village(String nom, Gaulois chef, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageois = 0;
		this.chef = chef;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillagesois(Gaulois villageois) {
		this.villageois[this.nbVillageois] = villageois;
		this.nbVillageois++;
	}

	public Gaulois[] getVillageois() {
		return villageois;
	}

	public int getNbVillageois() {
		return nbVillageois;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			System.out.println("Le Gaulois " + gaulois.getNom() + " a été ajouté au village " + nom + ".");
		} else {
			System.out.println("Le village est déjà plein. Impossible d'ajouter un nouveau Gaulois.");
		}
	}

	public Gaulois trouverHabitant(int numero) {
		if (numero >= 0 && numero < nbVillageois) {
			return villageois[numero];
		} else {
			System.out.println("Le numéro de villageois spécifié est invalide.");
			return null;
		}
	}

	public void afficherVillageois() {
		if (chef != null) {
			System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois : ");
		} else {
			System.out.println("Dans ce village, le chef n'est pas encore désigné.");
		}
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		village.ajouterHabitant(obelix);
		village.ajouterHabitant(asterix);
		village.trouverHabitant(0);
		village.afficherVillageois();
	}
}
//Gaulois gaulois = village.trouverHabitant(1);
//System.out.println(gaulois);
// Gaulois [nom=Astérix, force=8, effetPotion=1] c'est le deuxième habitant car
// le tableau est initialisé à 0.
