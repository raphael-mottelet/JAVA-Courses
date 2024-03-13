package catalogue;

public interface Vehicule {
	public abstract Scooter CreerScooter(String Modele, String Couleur, int Puissance, int Prix);
	public abstract Automobile CreerAutomobile(String Modele, String Couleur, int Puissance, double Masse, int Prix);
	public abstract JetSki CreerJetSki(String Modele, String Couleur, int Puissance, double Masse, int Prix);
}
