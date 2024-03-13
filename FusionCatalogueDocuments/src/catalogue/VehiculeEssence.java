package catalogue;

public class VehiculeEssence implements Vehicule{
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance, int Prix) {
		Scooter x = new ScooterEssence(Modele,Couleur,Puissance,Prix);
		return x;
	}
	public Automobile CreerAutomobile(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		Automobile x = new AutomobileEssence(Modele,Couleur,Puissance,Masse,Prix);
		return x;
	}

	public JetSki CreerJetSki(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		JetSki x = new JetSkiEssence(Modele,Couleur,Puissance,Masse,Prix);
		return x;
	}
}
