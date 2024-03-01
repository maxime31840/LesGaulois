package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;

	public Village(String nom, Chef chef) {
		this.nom = nom;
		this.villageois = 0;
		this.chef = chef;
		this.villageois = new Gaulois[100];
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterVillagesois(Gaulois villageois) {
		this.villageoi[this.villageois] = villageois;
		this.nbVillageois++;
	}

	public Gaulois[] getVillageois() {
		return villageois;
	}

	public int getVillageois() {
		return nbVillageois;
	}
}
