import java.time.*;

public class Slot {
    private String id;
    private Vehicle vehicle;
    private LocalTime inTime;
    private LocalDate inDate;

    public Slot(String id, Vehicle vehicle) {
        this.id = id;
        this.vehicle = vehicle;
        this.inTime = LocalTime.now();
        this.inDate = LocalDate.now();
    }

    public Slot() {
    }

    public Slot(String id, Vehicle vehicle, LocalTime inTime, LocalDate inDate) {
        this.id = id;
        this.vehicle = vehicle;
        this.inTime = inTime;
        this.inDate = inDate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalTime getInTime() {
        return this.inTime;
    }

    public void setInTime(LocalTime inTime) {
        this.inTime = inTime;
    }

    public LocalDate getInDate() {
        return this.inDate;
    }

    public void setInDate(LocalDate inDate) {
        this.inDate = inDate;
    }

    public Slot id(String id) {
        setId(id);
        return this;
    }

    public Slot vehicle(Vehicle vehicle) {
        setVehicle(vehicle);
        return this;
    }

    public Slot inTime(LocalTime inTime) {
        setInTime(inTime);
        return this;
    }

    public Slot inDate(LocalDate inDate) {
        setInDate(inDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", vehicle='" + getVehicle() + "'" +
                ", inTime='" + getInTime() + "'" +
                ", inDate='" + getInDate() + "'" +
                "}";
    }

}
