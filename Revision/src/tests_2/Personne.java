package tests_2;

public class Personne {
    // Champs privés (encapsulés)
    private String nom;
    private int age;

    // Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthodes publiques pour accéder aux champs privés (getters)
    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    // Méthodes publiques pour modifier les champs privés (setters)
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        if (age >= 0) {  // Validation de l'âge pour qu'il soit positif
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }

    // Méthode pour afficher les informations de la personne
    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
    }
}
