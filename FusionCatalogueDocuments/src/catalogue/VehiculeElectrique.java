package catalogue;

public class VehiculeElectrique implements Vehicule{
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance, int Prix) {
		Scooter x = new ScooterElectrique(Modele,Couleur,Puissance,Prix);
		return x;
	}
	public Automobile CreerAutomobile(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		Automobile x = new AutomobileElectrique(Modele,Couleur,Puissance,Masse,Prix);
		return x;
	}

	public JetSki CreerJetSki(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		JetSki x = new JetSkiElectrique(Modele,Couleur,Puissance,Masse,Prix);
		return x;
	}
}
