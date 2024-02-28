package entreprisevehicule;

import java.util.Scanner;

public class Catalogue {
	public static void main(String[] args) {
		char c;
		int i;
		Scanner s = new Scanner(System.in);
		int NbAutomobiles = 5;
		int NbScooters = 5;
		
		Automobile [] LesAutomobiles = new Automobile[NbAutomobiles];
		Scooter [] LesScooters = new Scooter[NbScooters];
		
		VehiculeElectrique FabriqueVehiculeElectrique = new VehiculeElectrique();
		VehiculeEssence FabriqueVehiculeEssence = new VehiculeEssence();
		VehiculeHybride FabriqueVehiculeHybride = new VehiculeHybride();
		LesAutomobiles[0] = FabriqueVehiculeEssence.CreerAutomobile("van", "jaune", 600, 3200.0);
		LesAutomobiles[1] = FabriqueVehiculeElectrique.CreerAutomobile("suv", "rouge", 140, 1600.0);
		LesAutomobiles[2] = FabriqueVehiculeElectrique.CreerAutomobile("coupe", "rouge", 300, 1000.0);
		LesAutomobiles[3] = FabriqueVehiculeEssence.CreerAutomobile("suv", "noir", 200, 1200);
		LesAutomobiles[4] = FabriqueVehiculeHybride.CreerAutomobile("coupe", "vert", 500, 2500);

		LesScooters[0] = FabriqueVehiculeElectrique.CreerScooter("2roues", "noir", 20);
		LesScooters[1] = FabriqueVehiculeElectrique.CreerScooter("3roues", "jaune", 30);
		LesScooters[2] = FabriqueVehiculeEssence.CreerScooter("2roues", "bleu", 15);
		LesScooters[3] = FabriqueVehiculeHybride.CreerScooter("3roues", "rouge", 35);
		LesScooters[4] = FabriqueVehiculeHybride.CreerScooter("2roues", "vert", 20);

		
		int Index = 0;
		LesAutomobiles[0].AfficheVehicule();
		
		do {
			System.out.println("'a' : Afficher le catalogue");
			System.out.println("'s' : Afficher véhicule suivant");
			System.out.println("'p' : Afficher véhicule précédent");
			System.out.println("'f' : Fermer le catalogue");
			System.out.println("Votre choix : ");
			c = s.next().charAt(0);
			
			if (c == 'a') {
				for(i=0; (i<NbAutomobiles);i=i+1) {
					LesAutomobiles[i].AfficheVehicule();
				}
				for(i=0;(i<NbScooters); i=i+1) {
					LesScooters[i].AfficheVehicule();
				}
				Index = 0;
			}
			else if (c == 's') {
				if (Index<NbAutomobiles + NbScooters - 1) {
					Index = Index + 1;
					if (Index < NbAutomobiles) {
						LesAutomobiles[Index].AfficheVehicule();
						System.out.println("\n");
					}else {
						LesScooters[Index - NbAutomobiles].AfficheVehicule();
						System.out.println("\n");
					}
					
				}else {
					System.out.println("Aucun Suivant");
					System.out.println("\n");
				}
			}
			else if (c == 'p') {
				if (Index>0) {
					Index = Index - 1;
					if (Index<NbAutomobiles) {
						LesAutomobiles[Index].AfficheVehicule();
						System.out.println("\n");
					}else {
						LesScooters[Index - NbAutomobiles].AfficheVehicule();
						System.out.println("\n");
					}
					
				}
				else {
					System.out.println("Aucun précédent");
					System.out.println("\n");
				}
			}
			else if (c == 'f') {
				System.out.println("Merci de votre visite !");
			}
		}while(c != 'f');
		s.close();
	}

}
