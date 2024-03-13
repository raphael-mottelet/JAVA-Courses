package catalogue;

public class VehiculeEssence implements Vehicule {
	public Automobile CreerAutomobile (String Modele, String Couleur, int Puissance, double Masse) {
	Automobile x = new AutomobileEssence(Modele,Couleur,Puissance, Masse);
	return x;
	}
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance) {
		Scooter x = new ScooterEssence(Modele,Couleur,Puissance);
		return x;
	}
	@Override
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance, double Masse) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Jetski CreerJetski(String Modele, String Couleur, int Puissance, double Masse) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object CreerJetSki(String string, String string2, int i, double d, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
