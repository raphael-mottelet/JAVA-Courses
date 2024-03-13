package catalogue;

public class ScooterEssence extends Scooter{
	public ScooterEssence(String Modele, String Couleur, int Puissance, int Prix) {
		super(Modele,Couleur,Puissance,Prix);
	}

	public String AfficheVehicule() {
		String Message;
		
		Message = "Scooter Essence ";
		Message =  Message + this.Modele + " ";
		Message =  Message + this.Couleur + " ";
		Message =  Message + this.Puissance + " chevaux ";
		Message =  Message + this.Prix + " euros ";
		Message =  Message + "\n";
		System.out.print(Message);
		return Message;
	}
}
