package Models;

import java.util.Date;

public class Ticket extends BaseModel {
    private long ticketNumber;
    private String userName;
    private Date entryDateTime;
    private Vehicle vehicle;
    private Operator issuedBy;
    private Gate entryGate;
    private ParkingSlot parkingSlot;
    private ParkingFloor parkingFloor;

    public Ticket(long ticketNumber,
                  String userName,
                  Date entryDateTime,
                  Vehicle vehicle,
                  Operator issuedBy,
                  Gate entryGate,
                  ParkingSlot parkingSlot,
                  ParkingFloor parkingFloor) {
        this.ticketNumber = ticketNumber;
        this.userName = userName;
        this.entryDateTime = entryDateTime;
        this.vehicle = vehicle;
        this.issuedBy = issuedBy;
        this.entryGate = entryGate;
        this.parkingSlot = parkingSlot;
        this.parkingFloor = parkingFloor;
    }

    public long getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(Date entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Operator getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Operator issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
