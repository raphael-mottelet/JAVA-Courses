package catalogue;

public class AutomobileEssence extends Automobile{
	public AutomobileEssence(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		super(Modele,Couleur,Puissance,Masse,Prix);
	}

	public String AfficheVehicule() {
		String Message;
		
		Message = "Automobile Essence ";
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
