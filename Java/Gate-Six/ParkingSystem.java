import java.util.Scanner;

public class ParkingSystem {

    static int TOTAL_SLOTS = 20;
    static int[] slots = new int[TOTAL_SLOTS + 1]; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("=============================");
        System.out.println("   Welcome to Parking Lot    ");
        System.out.println("=============================");

            System.out.println("\n1. Park a car");
            System.out.println("2. Remove a car");
            System.out.println("3. Display parking status");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter car number: ");
                    int carNumber = input.nextInt();
                    System.out.print("Enter preferred slot: ");
                    int preferred = input.nextInt();
                    enterCar(carNumber, preferred);
                }
                case 2 -> {
                    System.out.print("Enter slot number to vacate: ");
                    int slot = input.nextInt();
                    exitCar(slot);
                }
                case 3 -> displayStatus();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option. Try again.");
            }
    }

    static void enterCar(int carNumber, int preferred) {
        if (preferred != 0) {
            
            if (preferred < 1 || preferred > TOTAL_SLOTS) {
                System.out.println("Invalid slot number. Must be between 1 and " + TOTAL_SLOTS + ".");
                return;
            }
            if (slots[preferred] != 0) {
                System.out.println("Slot " + preferred + " is already occupied.");
                return;
            }

  
        System.out.println("--------------------------");
        System.out.println("Available: " + available + "  |  Occupied: " + occupied);
        System.out.println("--------------------------");
    }
}
