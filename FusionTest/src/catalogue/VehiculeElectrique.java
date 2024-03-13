package catalogue;

public abstract class VehiculeElectrique implements Vehicule{
	
	public Automobile CreerAutomobile(String Modele, String Couleur, int Puissance, double Masse) {
		Automobile x = new AutomobileElectrique(Modele,Couleur,Puissance, Masse);
		return x;
	}
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance) {
		Scooter x = new ScooterElectrique(Modele,Couleur,Puissance);
		return x;
	}
	
	public JetSki CreerJetSki(String Modele, String Couleur, int Puissance, double Masse) {
		JetSki x = new ScooterElectrique(Modele,Couleur,Puissance);
		return x;
	}
}
