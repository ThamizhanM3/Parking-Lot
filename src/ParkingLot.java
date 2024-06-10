public class ParkingLot {
    private Slot[] twoWheelerSlot = new Slot[10];
    private Slot[] fourWheelerSlot = new Slot[10];

    public ParkingLot() {
    }

    private String giveTwoWheelerSlot(String vehiclePlate) {
        int i;
        String slotId = "";
        Vehicle vehicle = new Vehicle("Two Wheeler", vehiclePlate);
        for (i = 0; i < 10; i++) {
            if (twoWheelerSlot[i] == null) {
                slotId = "TW-" + i;
                twoWheelerSlot[i] = new Slot(slotId, vehicle);
                break;
            }
        }
        return slotId;
    }

    private String giveFourWheelerSlot(String vehiclePlate, String vehicleClass) {
        int i;
        String slotId = "";
        Vehicle vehicle = new Vehicle("Four Wheeler", vehiclePlate, vehicleClass);
        for (i = 0; i < 10; i++) {
            if (fourWheelerSlot[i] == null) {
                slotId = "FW-" + i;
                fourWheelerSlot[i] = new Slot(slotId, vehicle);
                break;
            }
        }
        return slotId;
    }

    public String giveSlot(String vehicleType, String vehiclePlate, String vehicleClass) {
        String slotId;
        if (vehicleType == "Two Wheeler") {
            slotId = giveTwoWheelerSlot(vehiclePlate);
        } else {
            slotId = giveFourWheelerSlot(vehiclePlate, vehicleClass);
        }
        return slotId;
    }

    public Slot[] showTwoWheelerSlots() {
        return twoWheelerSlot;
    }

    public Slot[] showFourWheelerSlots() {
        return fourWheelerSlot;
    }
}
