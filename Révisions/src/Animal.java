
public class Test {
    String nom;
    int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age + " ans");
    }
}