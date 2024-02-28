package entreprisevehicule;
import java.util.Scanner;

public class Catalogue {

    public static void main(String[] args) {
        char c;
        Scanner s = new Scanner(System.in);

        int NbAutomobiles = 4;
        int NbScooters = 3;

        Automobile[] LesAutomobiles = new Automobile[NbAutomobiles];
        Scooter[] LesScooters = new Scooter[NbScooters];

        VehiculeElectrique FabriqueVehiculeElectrique = new VehiculeElectrique(null, null, NbScooters);
        Vehicule FabriqueVehiculeEssence = new VehiculeEssence();

        LesAutomobiles[0] = FabriqueVehiculeEssence.CreerAutomobile("van", "jaune", 600, 3200, 0);
        LesAutomobiles[1] = FabriqueVehiculeElectrique.CreerAutomobile("suv", "rouge", 600, 3200, 0);

        LesScooters[0] = (Scooter) FabriqueVehiculeEssence.CreerScooter("moto", "verte", 150, 500, 0); 
        LesScooters[1] = (Scooter) FabriqueVehiculeElectrique.CreerScooter("susuki", "bleu", 200, 450, 0);
    }
}
