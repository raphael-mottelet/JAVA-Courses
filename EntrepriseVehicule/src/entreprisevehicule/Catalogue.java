package entreprisevehicule;
import java.util.Scanner;

public class Catalogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner s=new Scanner(System.in);
		
		int NbAutomobiles=4;
		int NbScooters=3;
		
		Automobile [] LesAutomobiles = new Automobile[NbAutomobiles];
		Scooter [] LesScooters = new Scooter[NbScooters];
		
		Vehicule FabriqueVehiculeElectrique=new VehiculeElectrique();
		Vehicule FabriqueVehiculeEssence=new VehiculeEssence();
		
		LesAutomobiles[0]=FabriqueVehiculeEssence.CreerAutomobile("van","jaune",600,3200,0);
		LesAutomobiles[0]=FabriqueVehiculeElectrique.CreerAutomobile("suv","rouge",600,3200,0);
		
		LesScooters[0]=FabriqueVehiculeEssence.CreerAutomobile("moto","verte",150,500,0);
		LesScooters[0]=FabriqueVehiculeElectrique.CreerAutomobile("susuki","bleu",200,450,0);

	}

}
