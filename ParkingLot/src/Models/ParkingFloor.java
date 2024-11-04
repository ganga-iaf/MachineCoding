package Models;
import Models.Enums.ParkingFloorStatus;
import Models.Enums.VehicleType;

import java.util.*;
public class ParkingFloor extends BaseModel {
    private int parkingFloorNumber;
    private String name;
    private List<ParkingSlot> parkingSlots;
    private List<VehicleType> supportedVehicleTypes;

    public ParkingFloor() {
        this.name="";
        this.parkingSlots = new ArrayList<>();
        this.supportedVehicleTypes=new ArrayList<>();
        this.status=ParkingFloorStatus.Open;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public ParkingFloorStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingFloorStatus status) {
        this.status = status;
    }

    private ParkingFloorStatus status;




    public int getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public void setParkingFloorNumber(int parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }
}
