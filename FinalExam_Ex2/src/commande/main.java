package commande;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clientName;
        int identifiantAppareil, prixAppareil, dureeGarantie;
        String format;

        do {
            System.out.println("Nom client : ");
            clientName = scanner.nextLine();
            System.out.println("Identifiant de l'appareil (entier entre 1 et 9) : ");
            identifiantAppareil = getIntInput(scanner, 1, 9);
            System.out.println("Prix de l'appareil (entier entre 300 et 1500) : ");
            prixAppareil = getIntInput(scanner, 300, 1500);
            System.out.println("Durée de la garantie (entier entre 3 et 24) : ");
            dureeGarantie = getIntInput(scanner, 3, 24);
            System.out.println("Format du document (1) PDF ou (2) HTML : ");
            format = scanner.nextLine();
        } while (!format.equals("1") && !format.equals("2"));

        DocumentBuilder builder = null;

        if ("1".equals(format)) {
            builder = new FactureBuilder();
        } else if ("2".equals(format)) {
            builder = new GarantieBuilder();
        } else {
            System.out.println("Format non pris en charge.");
            return;
        }

        Directeur directeur = new Directeur(builder);

        directeur.construireDocument(clientName, identifiantAppareil, prixAppareil, dureeGarantie, format);

        Document document = directeur.getDocument();
        System.out.println("Document créé : " + document);

        scanner.close();
    }

    private static int getIntInput(Scanner scanner, int min, int max) {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    break;
                } else {
                    System.out.println("Veuillez entrer un entier entre " + min + " et " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un entier valide.");
            }
        }
        return input;
    }
}
