package test_package;

public class Chien extends Animal {
    String race;

    public Chien(String nom, int age, String race) {
        super(nom, age);
        this.race = race;
    }

    public void aboyer() {
        System.out.println("Le chien " + nom + " aboie!");
    }
}
