package entreprisevehicule;

public class VehiculeEssence implements Vehicule {
	public Automobile CreerAutomobile (String Modele, String Couleur, int Puissance, double Masse) {
	Automobile x = new AutomobileEssence(Modele,Couleur,Puissance, Masse);
	return x;
	}
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance) {
		Scooter x = new ScooterEssence(Modele,Couleur,Puissance);
		return x;
	}
}
