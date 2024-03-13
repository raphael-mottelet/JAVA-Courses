package catalogue;

public class ScooterHybride extends Scooter{
	public ScooterHybride(String Modele, String Couleur, int Puissance, int Prix) {
		super(Modele,Couleur,Puissance,Prix);
	}

	public String AfficheVehicule() {
		String Message;
		
		Message = "Scooter Hybride ";
		Message =  Message + this.Modele + " ";
		Message =  Message + this.Couleur + " ";
		Message =  Message + this.Puissance + " chevaux ";
		Message =  Message + this.Prix + " euros ";
		Message =  Message + "\n";
		System.out.print(Message);
		return Message;
	}
}
