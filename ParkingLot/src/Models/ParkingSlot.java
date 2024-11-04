package Models;

import Models.Enums.ParkingSlotStatus;
import Models.Enums.VehicleType;

public class ParkingSlot extends BaseModel {
    private VehicleType parkingSlotType;
    private Vehicle vehicle;
    private ParkingSlotStatus status;

    public ParkingSlot(VehicleType parkingSlotType, Vehicle vehicle, boolean isOccupied) {
        this.parkingSlotType = parkingSlotType;
        this.vehicle = vehicle;
    }

    public VehicleType getParkingSlotType() {
        return parkingSlotType;
    }
    public void setParkingSlotType(VehicleType parkingSlotType) {
        this.parkingSlotType = parkingSlotType;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    }
