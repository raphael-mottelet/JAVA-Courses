package catalogue;

public interface Vehicule {
	
	public Automobile CreerAutomobile(String Modele, String Couleur, int Puissance, double Masse);
	public Scooter CreerScooter(String Modele, String Couleur, int Puissance, double Masse);
	public Jetski CreerJetski(String Modele, String Couleur, int Puissance, double Masse);
	public Object CreerJetSki(String string, String string2, int i, double d, int j);
}
