package Geometrie;
import java.util.Scanner;

public class Cercle {
    protected double rayon;

    public Cercle() {
        this.rayon = 4.0; 
    }

    public Cercle(double r) {
        if(r > 0) {
            this.rayon = r;
        } else {
            this.rayon = 4.0;
        }
    }

    public Cercle (Scanner s) {
        double x;
        do {
            System.out.println("Entrez le rayon : ");
            while (!s.hasNextDouble()) {
                System.out.println("Veuillez entrer un nombre valide !");
                s.next();
            }
            x = s.nextDouble();
        } while (x <= 0);
        this.rayon = x;
    }
}
