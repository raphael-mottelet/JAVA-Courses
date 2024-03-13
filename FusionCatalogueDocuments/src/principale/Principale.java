package principale;

import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DescriptionVehicule;
		Scanner s = new Scanner(System.in);
		
		catalogue.Catalogue MonCatalogue = new catalogue.Catalogue();
		MonCatalogue.RemplissageCatalogue();
		
		DescriptionVehicule = MonCatalogue.NavigationCatalogue(s);
		if(DescriptionVehicule != "") {
			documents.Client MonClient = new documents.Client(3);
			MonClient.ProductionDesDocuments(s,DescriptionVehicule);
		}
		s.close();
	}

}
