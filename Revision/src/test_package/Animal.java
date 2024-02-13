package test_package;

public class Animal {
    String nom;
    String proprietaire;
    int age;

    public Animal(String nom, String proprietaire, int age) {
        this.nom = nom;
        this.age = age;
        this.proprietaire = proprietaire;
    }

    public void afficherInfos() {
    	System.out.println("Proprietaire: " + proprietaire);
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age + " ans");
    }
}
