package catalogue;

import java.util.Scanner;

public class Catalogue<LesJetSkis, LesJetSkis> {

	private int NbAutomobiles = 5;
	private int NbScooters = 5;
	private int NbJetSki = 3;

	private Automobile [] LesAutomobiles = new  Automobile[NbAutomobiles];
	private Scooter [] LesScooters = new  Scooter[NbScooters];
	private JetSki [] LesJetSkis = new  JetSki[NbJetSki];
	

	public void RemplissageCatalogue() {
		Vehicule FabriqueVehiculeEssence = new VehiculeEssence();
		Vehicule FabriqueVehiculeElectrique = new VehiculeElectrique();
		Vehicule FabriqueVehiculeHybride = (Vehicule) new VehiculeHybride();
		
		LesAutomobiles[0] = FabriqueVehiculeEssence.CreerAutomobile("van","jaune",600,3200.0);
		LesAutomobiles[1] = FabriqueVehiculeElectrique.CreerAutomobile("suv","rouge",140,1600.0);
		LesAutomobiles[2] = FabriqueVehiculeElectrique.CreerAutomobile("coupe","rouge",300,1000.0);
		LesAutomobiles[3] = FabriqueVehiculeEssence.CreerAutomobile("suv","noir",200,1200.0);
		LesAutomobiles[4] = FabriqueVehiculeHybride.CreerAutomobile("coupe","vert",500,2500.0);
		
		LesScooters[0] = FabriqueVehiculeElectrique.CreerScooter("2 roues","noir",20,800);
		LesScooters[1] = FabriqueVehiculeElectrique.CreerScooter("3 roues","jaune",30,550);
		LesScooters[2] = FabriqueVehiculeEssence.CreerScooter("2 roues","bleu",15,900);
		LesScooters[3] = FabriqueVehiculeHybride.CreerScooter("3 roues","rouge",35,1350);
		LesScooters[4] = FabriqueVehiculeHybride.CreerScooter("2 roues","vert",20,1450);
		
		LesJetSkis[0] = FabriqueVehiculeEssence.CreerJetSki("recreation","blanc",800,700.0,5200);
		LesJetSkis[1] = FabriqueVehiculeElectrique.CreerJetSki("tow sport","jaune",1000,900.0,4750);
		LesJetSkis[2] = FabriqueVehiculeHybride.CreerJetSki("tow sport","blanc",950,600.0,3560);
	}


	public String AfficheElementCatalogue(int Index) {
		String DescriptionVehicule;
		
		if(Index < NbAutomobiles) {
			DescriptionVehicule = LesAutomobiles[Index].AfficheVehicule();
		}else if(Index < NbAutomobiles + NbScooters) {
			DescriptionVehicule = LesScooters[Index - NbAutomobiles].AfficheVehicule();
		}else {
			DescriptionVehicule = LesJetSkis[Index - (NbAutomobiles + NbScooters)].AfficheVehicule();
		}
		
		return DescriptionVehicule;
	}
	
	public String ChoixVehiculeCatalogue(Scanner s) {
		int IdVehicule;
		String DescriptionVehicule;
		
		
		System.out.println("---- CHOIX DU VEHICULE ----\n");
		
		do {
			System.out.print("Numero du vehicule: ");
			IdVehicule = s.nextInt();
		}while((IdVehicule < 1)||(IdVehicule > 13));
		
		System.out.println("\n Vous avez choisi le vehicule ci-dessous: ");
		
		DescriptionVehicule = AfficheElementCatalogue(IdVehicule-1); 
		return DescriptionVehicule;
	}
	
	public String NavigationCatalogue(Scanner s) {
		int Index,i;
		char c;
		String DescriptionVehicule;
		
		System.out.println("---- NAVIGATION DANS LE CATALOGUE ----\n");
		
		LesAutomobiles[0].AfficheVehicule();
		System.out.print("\n");
		Index = 0;
		
		do {
			System.out.println("'a': Afficher tout le catalogue");
			System.out.println("'p': Afficher vehicule precedent");
			System.out.println("'s': Afficher vehicule suivant");
			System.out.println("'c': Selectionner un vehicule");
			System.out.println("'f': fermer le catalogue");
			System.out.print("Votre choix: ");
			
			c = s.next().charAt(0);
			System.out.print("\n");
			
			if(c == 'a') {
				for(i=0;(i < NbAutomobiles);i=i+1) {
					LesAutomobiles[i].AfficheVehicule();
				}
				for(i=0;(i < NbScooters);i=i+1) {
					LesScooters[i].AfficheVehicule();
				}
				for(i=0;(i < NbJetSki);i=i+1) {
					LesJetSkis[i].AfficheVehicule();
				}
				System.out.print("\n");
				Index = 0;
			}else if(c == 'p') {
				if(Index > 0) {
					Index = Index - 1;
					AfficheElementCatalogue(Index);
				}else {
					Index = NbAutomobiles + NbScooters + NbJetSki - 1;
					LesJetSkis[NbJetSki-1].AfficheVehicule();
				}
				System.out.print("\n");
			}else if(c == 's') {
				if(Index < NbAutomobiles + NbScooters + NbJetSki - 1) {
					Index = Index + 1;
					AfficheElementCatalogue(Index);
				}else {
					Index = 0;
					LesAutomobiles[0].AfficheVehicule();
				}
				System.out.print("\n");
			}else if(c == 'c') {
				DescriptionVehicule = ChoixVehiculeCatalogue(s);
				return DescriptionVehicule;
			}
			
		}while((c != 'f')&&(c != 'c'));
		
		System.out.println("Fermeture du catalogue !!!");
		return "";
	}
}
