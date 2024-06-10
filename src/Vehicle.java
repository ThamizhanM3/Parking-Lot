public class Vehicle {
    private String vehicleType;
    private String vehiclePlate;
    private String vehicleClassString;

    public Vehicle() {
    }

    public Vehicle(String vehicleType, String vehiclePlate) {
        this.vehicleType = vehicleType;
        this.vehiclePlate = vehiclePlate;
    }

    public Vehicle(String vehicleType, String vehiclePlate, String vehicleClassString) {
        this.vehicleType = vehicleType;
        this.vehiclePlate = vehiclePlate;
        this.vehicleClassString = vehicleClassString;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlate() {
        return this.vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getVehicleClassString() {
        return this.vehicleClassString;
    }

    public void setVehicleClassString(String vehicleClassString) {
        this.vehicleClassString = vehicleClassString;
    }

    public Vehicle vehicleType(String vehicleType) {
        setVehicleType(vehicleType);
        return this;
    }

    public Vehicle vehiclePlate(String vehiclePlate) {
        setVehiclePlate(vehiclePlate);
        return this;
    }

    public Vehicle vehicleClassString(String vehicleClassString) {
        setVehicleClassString(vehicleClassString);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " vehicleType='" + getVehicleType() + "'" +
                ", vehiclePlate='" + getVehiclePlate() + "'" +
                ", vehicleClassString='" + getVehicleClassString() + "'" +
                "}";
    }

}
