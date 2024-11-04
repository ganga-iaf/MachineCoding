package Models;

import Models.Enums.ParkingLotStatus;
import Models.Enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotBuilding extends BaseModel {
 private List<ParkingFloor>  parkingFloors;
 private List<Gate> entryGates;
 private List<Gate> exitGates;
 private List<VehicleType> supportedVehicleTypes;
 private ParkingLotStatus status;

 public ParkingLotBuilding(){
  this.parkingFloors=new ArrayList<>();
  this.entryGates=new ArrayList<>();
  this.exitGates=new ArrayList<>();
  this.supportedVehicleTypes=new ArrayList<>();
  this.status=ParkingLotStatus.Open;
 }

 public List<ParkingFloor> getParkingFloors() {
  return parkingFloors;
 }

 public void setParkingFloors(List<ParkingFloor> parkingFloors) {
  this.parkingFloors = parkingFloors;
 }

 public List<Gate> getEntryGates() {
  return entryGates;
 }

 public void setEntryGates(List<Gate> entryGates) {
  this.entryGates = entryGates;
 }

 public List<Gate> getExitGates() {
  return exitGates;
 }

 public void setExitGates(List<Gate> exitGates) {
  this.exitGates = exitGates;
 }

 public List<VehicleType> getSupportedVehicleTypes() {
  return supportedVehicleTypes;
 }

 public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
  this.supportedVehicleTypes = supportedVehicleTypes;
 }

 public ParkingLotStatus getStatus() {
  return status;
 }

 public void setStatus(ParkingLotStatus status) {
  this.status = status;
 }
}
