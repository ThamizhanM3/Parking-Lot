import java.util.Scanner;

public class ConsoleScreen {
    private Scanner scanner = new Scanner(System.in);

    public void parkTwoWheeler(ParkingLot parkingLot) {
        System.out.print("\033\143");
        System.out.println("You have chose to park your two wheeler");
        System.out.println();
        System.out.println();
        System.out.println("Please provide your vehicle details as follows:-");
        System.out.println();
        System.out.print("Vehicle registeration lisence plate number: ");
        scanner.nextLine();
        String vehiclePlate = scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("You have chose to park your two wheeler lisenced: " + vehiclePlate);
        String slotId = parkingLot.giveSlot("Two Wheeler", vehiclePlate, "Two Wheeler");
        System.out.println();
        System.out.println("You can park your vehicle at Slot: " + slotId);
        System.out.println();
        System.out.println();
    }

    public void parkFourWheeler(ParkingLot parkingLot) {
        System.out.print("\033\143");
        System.out.println("You have chose to park your four wheeler");
        System.out.println();
        System.out.println();
        System.out.println("Please provide your vehicle details as follows:-");
        System.out.println();
        System.out.print("Vehicle registeration lisence plate number: ");
        scanner.nextLine();
        String vehiclePlate = scanner.nextLine();
        System.out.println();
        System.out.print("Vehicle type: ");
        String vehicleType = scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("You have chose to park your four wheeler lisenced: " + vehiclePlate);
        String slotId = parkingLot.giveSlot("Four Wheeler", vehiclePlate, vehicleType);
        System.out.println();
        System.out.println("You can park your vehicle at Slot: " + slotId);
        System.out.println();
        System.out.println();
    }

    private void parkVehicle(ParkingLot parkingLot) {
        System.out.print("\033\143");
        System.out.println("You have chose to park your vehicle");
        System.out.println();
        System.out.println();
        System.out.println("What type of vehicle do you want to park? Choose from the options below");
        System.out.println();
        System.out.println("1. Two Wheeler");
        System.out.println("2. Four Wheeler");
        System.out.println();
        System.out.print("Choose your option: ");
        int input = scanner.nextInt();
        if (input == 1) {
            parkTwoWheeler(parkingLot);
        } else if (input == 2) {
            parkFourWheeler(parkingLot);
        } else {
            System.out.println("No such option available");
        }
    }

    private void getVehicle() {
        System.out.print("\033\143");
        System.out.println("Get Vehicle ");
    }

    public void newMenu(ParkingLot parkingLot) {
        System.out.print("\033\143");
        System.out.println("Welcome to M3's Parking Lot");
        System.out.println();
        System.out.println();
        System.out.println("Do you want to park your vehicle or get your vehicle? Choose from the options below");
        System.out.println();
        System.out.println("1. Park your vehicle");
        System.out.println("2. Get your vehicle");
        System.out.println();
        System.out.print("Choose your option: ");
        int input = scanner.nextInt();
        if (input == 1) {
            parkVehicle(parkingLot);
        } else if (input == 2) {
            getVehicle();
        } else {
            System.out.println("No such option available");
        }
    }
}
