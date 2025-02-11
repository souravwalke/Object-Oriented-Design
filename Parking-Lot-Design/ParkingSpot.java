public class ParkingSpot {

    private final int spotNo;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNo, VehicleType vehicleType){
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }

    public syncronized boolean isSpotAvailable(){
        return parkedVehicle == null;
    }

    public syncronized void parkVehicle(Vehicle vehicle){
        if(isSpotAvailable() && vehicle.vehicleType == vehicleType){
            parkedVehicle = vehicle;
        }
        else {
            throw new IllegalArgumentException("Invalid vehicle type or spot already occupied."); 
        }
    }

    public synchronized void unparkVehicle() {
        parkedVehicle = null;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

}
