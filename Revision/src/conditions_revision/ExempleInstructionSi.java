package conditions_revision;

import java.util.Scanner;

public class ExempleInstructionSi {
    public static void main(String[] args) {
        // Utilisation des instructions conditionnelles pour déterminer si un nombre est positif, négatif ou nul
        Scanner scanner = new Scanner(System.in);
        int nombre;
        
        System.out.println("Entrez un nombre : ");
        nombre = scanner.nextInt();
        
        if (nombre > 0) {
            System.out.println("Le nombre est positif.");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif.");
        } else {
            System.out.println("Le nombre est nul.");
        }
        
        scanner.close();
    }
}
