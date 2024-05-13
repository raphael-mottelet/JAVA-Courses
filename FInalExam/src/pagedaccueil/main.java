package pagedaccueil;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
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
}

