package documents;

import java.util.Scanner;

public class Client {
	private int MaxDocs;
	
	public Client(int MaxDocs) {
		this.MaxDocs = MaxDocs;
	}

	public void ProductionDesDocuments(Scanner s, String DescriptionVehicule) {
		Vendeur LeVendeur;
		FabriqueLiasse FabriqueClient;
		String NomClient;
		Liasse LiasseClient;
		int Format;
		
		System.out.print("Nom client: ");
		NomClient = s.next();
		
		do {
			System.out.print("Format des documents - (1)Html (2)Pdf (3)Xml: ");
			Format = s.nextInt();
		}while((Format != 1)&&(Format != 2)&&(Format != 3));
		
		if(Format == 1) {
			FabriqueClient = new FabriqueLiasseHtml(this.MaxDocs);
		}else if(Format == 2){
			FabriqueClient = new FabriqueLiassePdf(this.MaxDocs);
		}else {
			FabriqueClient = new FabriqueLiasseXML(this.MaxDocs);
		}
		
		LeVendeur = new Vendeur(FabriqueClient);
		LiasseClient = LeVendeur.FabriqueDocuments(NomClient, DescriptionVehicule);
		LiasseClient.ImprimerLiasse();
	}

}
