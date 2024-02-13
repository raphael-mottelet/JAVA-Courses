public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Rex", 5);
        animal.afficherInfos();  // Affiche les informations de l'animal

        Chien chien = new Chien("Max", 3, "Labrador");
        chien.afficherInfos();   // Affiche les informations du chien
        chien.aboyer();          // Fait aboyer le chien
    }
}
