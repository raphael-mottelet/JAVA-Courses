package test_package;

public class Chien extends Animal {
    String race;

    public Chien(String nom, String proprietaire, int age, String race) {
        super(nom, proprietaire, age);
        this.race = race;
    }

    public void aboyer() {
        System.out.println("Le chien " + nom + "Du propriétaire" + proprietaire + " aboie!");
    }
}
