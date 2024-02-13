package tests_2;

public class Main {
    public static void main(String[] args) {
        // Création d'une personne avec le constructeur
        Personne personne = new Personne("Alice", 30);

        // Utilisation des getters pour accéder aux informations
        System.out.println("Nom: " + personne.getNom());
        System.out.println("Âge: " + personne.getAge());

        // Utilisation des setters pour modifier les informations
        personne.setNom("Bob");
        personne.setAge(25);

        // Affichage des informations mises à jour
        personne.afficherInfos();
    }
}
