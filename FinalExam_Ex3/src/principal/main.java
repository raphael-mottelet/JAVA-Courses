package principal;

import pagedaccueil.*;
import commande.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choix;

        do {
            System.out.println("==== PAGE D’ACCUEIL =====");
            System.out.println("‘p’: Appareil précédent");
            System.out.println("‘s’ : Appareil suivant");
            System.out.println("‘c’ : Commander un appareil");
            System.out.println("‘q’ : Quitter la page");
            System.out.print("Votre choix : ");
            choix = scanner.nextLine().toLowerCase().charAt(0);

            switch (choix) {
                case 'p':
                case 's':
                    afficherPageAccueil();
                    break;
                case 'c':
                    commanderAppareil();
                    break;
                case 'q':
                    System.out.println("Vous avez quitté la page d'accueil.");
                    break;
                default:
                    System.out.println("Saisie non valide. Veuillez réessayer.");
                    break;
            }
        } while (choix != 'q');

        scanner.close();
    }

    private static void afficherPageAccueil() {
        AppareilFactory appleFactory = new AppleFactory();
        AppareilFactory androidFactory = new AndroidFactory();

        Appareil[] appareils = new Appareil[]{
            appleFactory.creerTelephoneMobile("Iphone", 8, "10.2.4", 900),
            appleFactory.creerTelephoneMobile("Iphone", 6, "12.1.0", 700),
            androidFactory.creerTelephoneMobile("Motorola edge", 20, "11.4.3", 300),
            androidFactory.creerTelephoneMobile("Motorola edge", 30, "10.3.1", 600),
            appleFactory.creerTelephoneMobile("Iphone", 11, "13.1.3", 1000),
            androidFactory.creerTablette("Galaxy Tab S", 8, "11.2.1", 300),
            androidFactory.creerTablette("Galaxy Tab S", 9, "10.1.2", 400),
            appleFactory.creerTablette("Ipad pro", 10, "12.2.4", 1200),
            appleFactory.creerTablette("Ipad pro", 11, "13.1.0", 1500)
        };

        Scanner scanner = new Scanner(System.in);
        int currentIndex = 0;
        char choix;
        do {
            System.out.println(appareils[currentIndex]);
            System.out.print("'p': Appareil précédent, 's': Appareil suivant, 'q': Quitter la page\nVotre choix : ");
            choix = scanner.nextLine().toLowerCase().charAt(0);

            switch (choix) {
                case 'p':
                    currentIndex = Math.max(0, currentIndex - 1);
                    break;
                case 's':
                    currentIndex = Math.min(appareils.length - 1, currentIndex + 1);
                    break;
                case 'q':
                    System.out.println("Vous avez quitté la page d'accueil.");
                    break;
                default:
                    System.out.println("Saisie non valide. Veuillez réessayer.");
                    break;
            }
        } while (choix != 'q');
        scanner.close();
    }

    private static void commanderAppareil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== COMMANDE =====");
        System.out.print("Nom client : ");
        String nomClient = scanner.nextLine();

        System.out.print("Identifiant appareil : ");
        int identifiantAppareil = scanner.nextInt();

        System.out.print("Format - (1) PDF (2) HTML : ");
        int format = scanner.nextInt();
        scanner.nextLine(); 

        DocumentBuilder builder = null;

        if (format == 1) {
            builder = new FactureBuilder();
        } else if (format == 2) {
            builder = new GarantieBuilder();
        } else {
            System.out.println("Format non pris en charge.");
            extracted();
        }

        Directeur directeur = new Directeur(builder);

        System.out.print("Prix de l'appareil : ");
        int prixAppareil = scanner.nextInt();
        System.out.print("Durée de la garantie : ");
        int dureeGarantie = scanner.nextInt();
        scanner.nextLine();

        directeur.construireDocument(nomClient, identifiantAppareil, prixAppareil, dureeGarantie, format);

        Document document = directeur.getDocument();
        System.out.println("Document créé : " + document);

        scanner.close();
    }

	private static void extracted() {
	}
}
