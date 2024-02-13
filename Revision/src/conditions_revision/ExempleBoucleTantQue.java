package conditions_revision;

import java.util.Scanner;

public class ExempleBoucleTantQue {
    public static void main(String[] args) {
        // Utilisation d'une boucle tant que pour demander à l'utilisateur une saisie jusqu'à ce qu'il entre 'quitter'
        Scanner scanner = new Scanner(System.in);
        String saisie;
        
        System.out.println("Entrez 'quitter' pour sortir : ");
        saisie = scanner.nextLine();
        
        while (!saisie.equals("quitter")) {
            System.out.println("Vous avez saisi : " + saisie);
            System.out.println("Entrez 'quitter' pour sortir : ");
            saisie = scanner.nextLine();
        }
        
        scanner.close();
    }
}
