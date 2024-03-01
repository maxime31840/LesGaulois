package Scénario;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Histoire {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 1, 50);

		asterix.parler("Bonjour à tous !");
		minus.parler(" « UN GAU... UN GAUGAU...»");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}
}
