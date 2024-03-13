package catalogue;

public class JetskiHybride {
	private static final String Couleur = null;
	private static final String Modele = null;
	public void JetSkiHybride(String Modele, String Couleur, int Puissance, double Masse) {
		super(Modele, Couleur, Puissance,Masse);
	}
	public vid AfficheVehicule() {
		System.out.print("JetskiHybride");
		System.out.print(this.Couleur+"");
		System.out.print(this.Modele+"");
		System.out.print(this.Puissance+"");
		System.out.print(this.Masse+"");
	}
}
