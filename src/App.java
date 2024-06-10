// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = new ParkingLot();

        // Scanner scanner = new Scanner(System.in);

        // parkingLot.giveSlot("Two Wheeler", "TN 37 DM 3366", "Two Wheeler");
        // parkingLot.giveSlot("Two Wheeler", "TN 37 DM 2255", "Two Wheeler");
        // parkingLot.giveSlot("Two Wheeler", "TN 37 DM 1144", "Two Wheeler");
        // parkingLot.giveSlot("Four Wheeler", "TN 37 DM 6633", "Sedan");
        // parkingLot.giveSlot("Four Wheeler", "TN 37 DM 5522", "Hatch Back");
        // parkingLot.giveSlot("Four Wheeler", "TN 37 DM 4411", "Coupe");

        // Slot[] fourWheelerSlot = parkingLot.showFourWheelerSlots();
        // Slot[] twoWheelerSlot = parkingLot.showTwoWheelerSlots();

        // System.out.print("\033\143");
        // for (Slot slot : fourWheelerSlot) {
        //     if (slot != null) {
        //         System.out.println(slot);
        //     }
        // }
        // scanner.nextLine();
        // System.out.print("\033\143");
        // for (Slot slot : twoWheelerSlot) {
        //     if (slot != null) {
        //         System.out.println(slot);
        //     }
        // }
        ConsoleScreen consoleScreen = new ConsoleScreen();
        consoleScreen.newMenu(parkingLot);
    }
}
