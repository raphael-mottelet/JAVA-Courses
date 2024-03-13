package catalogue;

public class JetSkiHybride extends JetSki{
	public JetSkiHybride(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		super(Modele,Couleur,Puissance,Masse,Prix);
	}

	public String AfficheVehicule() {
		String Message;
		
		Message = "JetSki Hybride ";
		Message =  Message + this.Modele + " ";
		Message =  Message + this.Couleur + " ";
		Message =  Message + this.Masse + " Kg ";
		Message =  Message + this.Puissance + " chevaux ";
		Message =  Message + this.Prix + " euros ";
		Message =  Message + "\n";
		System.out.print(Message);
		return Message;
	}
}
