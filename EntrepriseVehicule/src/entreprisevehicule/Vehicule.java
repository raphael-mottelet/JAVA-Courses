package entreprisevehicule;

public interface Vehicule {
	
	public Automobile CreerAutomobile(String Modele, String Couleur, int Puissance, double Masse);
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance, double Masse);
	public Jetski CreerJetski(String Modele, String Couleur, int Puissance, double Masse);
}
