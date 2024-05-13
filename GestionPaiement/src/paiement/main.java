package paiement;

import java.util.Scanner;

public class SystemePaiement {

    public static void main(String[] args) {
        int prix, mode;
        Client leClient;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Entrez le prix de l'article: ");
            prix = scanner.nextInt();
        } while (prix <= 0);

        do {
            System.out.println("Entrez le mode de paiement - (1) Carte, (2) PayPal");
            mode = scanner.nextInt();
        } while (mode != 1 && mode != 2);

        if (mode == 1) {
            leClient = new ClientCarte();
        } else {
            leClient = new ClientPaypal();
        }

        leClient.Payer(prix);

        scanner.close();
    }
}