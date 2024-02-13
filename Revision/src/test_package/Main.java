package test_package;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Rex", "Larry-Page", 05);
        animal.afficherInfos();  // Affiche les informations de l'animal
        

        Chien chien = new Chien("Max", " Larry-Page", 3, "Labrador");
        chien.afficherInfos();   // Affiche les informations du chien
        chien.aboyer();          // Fait aboyer le chien
    }
}
