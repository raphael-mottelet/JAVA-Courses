package librairie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char c;
        Scanner s = new Scanner(System.in);
        int NbBD = 5;
        int NbRomans = 5;
        int NbRevues = 3;

        Romans[] LesRomans = new Romans[NbRomans];
        BD[] LesBD = new BD[NbBD];
        Revues[] LesRevues = new Revues[NbRevues];

        Livres FabriqueLivresBroche = new LivresBroche();
        Livres FabriqueLivresRelie = new LivresRelie();

        LesRomans[0] = FabriqueLivresBroche.CreerRomans("Guerre et Paix", 1869, 1225, 40);
        LesRomans[1] = FabriqueLivresRelie.CreerRomans("1984", 1949, 328, 24);
        LesRomans[2] = FabriqueLivresBroche.CreerRomans("Le Seigneur des Anneaux", 1954, 1178, 60);
        LesRomans[3] = FabriqueLivresRelie.CreerRomans("Jane Eyre", 1847, 500, 18);
        LesRomans[4] = FabriqueLivresBroche.CreerRomans("Orgueil et Préjugés", 1813, 432, 22);

        LesBD[0] = FabriqueLivresRelie.CreerBD("Les Aventures de Tintin", 1929, 62, 15);
        LesBD[1] = FabriqueLivresBroche.CreerBD("Lucky Luke", 1946, 48, 10);
        LesBD[2] = FabriqueLivresBroche.CreerBD("Astérix", 1959, 48, 12);
        LesBD[3] = FabriqueLivresRelie.CreerBD("Les Schtroumpfs", 1958, 64, 8);
        LesBD[4] = FabriqueLivresRelie.CreerBD("Spirou et Fantasio", 1938, 52, 11);

        LesRevues[0] = FabriqueLivresBroche.CreerRevues("Scientific American", 48, 5.99, "Springer Nature");
        LesRevues[1] = FabriqueLivresRelie.CreerRevues("National Geographic", 120, 12, "National Geographic Society");
        LesRevues[2] = FabriqueLivresBroche.CreerRevues("The Economist", 80, 10, "The Economist Group");

        int Index = 0;
        do {
            System.out.println("'a' : Afficher le catalogue");
            System.out.println("'s' : Afficher livre suivant");
            System.out.println("'p' : Afficher livre précédent");
            System.out.println("'f' : Fermer le catalogue");
            System.out.println("Votre choix : ");
            c = s.next().charAt(0);

            if (c == 'a') {
                for (int i = 0; i < NbRomans; i++) LesRomans[i].AfficheLivre();
                for (int i = 0; i < NbBD; i++) LesBD[i].AfficheLivre();
                for (int i = 0; i < NbRevues; i++) LesRevues[i].AfficheLivre();
                Index = 0;
            } else if (c == 's') {
                if (Index < NbRomans + NbBD + NbRevues - 1) {
                    Index++;
                    if (Index < NbRomans) LesRomans[Index].AfficheLivre();
                    else if (Index < NbRomans + NbBD) LesBD[Index - NbRomans].AfficheLivre();
                    else LesRevues[Index - (NbRomans + NbBD)].AfficheLivre();
                } else {
                    System.out.println("Aucun Suivant");
                }
            } else if (c == 'p') {
                if (Index > 0) {
                    Index--;
                    if (Index < NbRomans) LesRomans[Index].AfficheLivre();
                    else if (Index < NbRomans + NbBD) LesBD[Index - NbRomans].AfficheLivre();
                    else LesRevues[Index - (NbRomans + NbBD)].AfficheLivre();
                } else {
                    System.out.println("Aucun Précédent");
                }
            } else if (c == 'f') {
                System.out.println("Merci de votre visite !");
            }


        } while (c != 'f');
        s.close();
    }
}
