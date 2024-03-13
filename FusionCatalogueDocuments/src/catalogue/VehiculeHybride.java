package catalogue;

public class VehiculeHybride implements Vehicule{
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance, int Prix) {
		Scooter x = new ScooterHybride(Modele,Couleur,Puissance,Prix);
		return x;
	}
	public Automobile CreerAutomobile(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		Automobile x = new AutomobileHybride(Modele,Couleur,Puissance,Masse,Prix);
		return x;
	}

	public JetSki CreerJetSki(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		JetSki x = new JetSkiHybride(Modele,Couleur,Puissance,Masse,Prix);
		return x;
	}
}
