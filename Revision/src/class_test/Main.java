package class_test;


public class Main {
    public static void main(String[] args) {
        // Création d'une instance de MaClasse avec une valeur initiale de 10
        MaClasse objet = new MaClasse(10);

        // Accès à maVariablePrivee à l'aide de la méthode getter
        System.out.println("Valeur de maVariablePrivee : " + objet.getMaVariablePrivee());

        // Modification de maVariablePrivee à l'aide de la méthode setter
        objet.setMaVariablePrivee(20);
        System.out.println("Nouvelle valeur de maVariablePrivee : " + objet.getMaVariablePrivee());
    }
}
