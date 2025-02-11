
public class ParkingLevel {

    private final int levelNo;
    private List<ParkingSpot> parkingSpots;

    public ParkingLevel(int levelNumber, int numSpots, ParkingSpotType type) {
        this.levelNo = levelNumber;
        this.parkingSpots = new ArrayList<>();
        for(int i = 1; i <= numSpots; i++){
            parkingSpots.add(new ParkingSpot(i, type));
        }
    }

    
    
}
