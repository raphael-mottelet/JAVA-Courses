package Exercice3;

import java.util.Scanner;

public class TestFractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le numérateur : ");
        double x = scanner.nextDouble();
        System.out.print("Entrez le dénominateur : ");
        double y = scanner.nextDouble();

        Fractions f = new Fractions(x, y);
        System.out.println("Fraction f :");
        f.Affiche();

        f.Inverse();
        System.out.println("Inverse de f :");
        f.Affiche();

        f.ChangeNum(f.DonneNum() + 1.5);
        f.ChangeDeno(f.DonneDeno() + 3.5);
        System.out.println("f après modif :");
        f.Affiche();

        FractionsOp g = new FractionsOp(2.4, 7.3);
        System.out.println("Fraction g :");
        g.Affiche();

        g.Oppose();
        System.out.println("Opposée de g :");
        g.Affiche();

        scanner.close();
    }
}
