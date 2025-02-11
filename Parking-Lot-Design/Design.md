**Design a Parking Lot**

Step 1: **Requirements**

1. The parking lot should have multiple levels, each level with a certain number of parking spots.
2. The parking lot should support different types of vehicles, such as cars, motorcycles, and trucks
3. The system should assign a parking spot to a vehicle upon entry and release it when the vehicle exits.
4. The system should track the availability of parking spots and provide real-time information to customers.

**Clarifying Questions**

1. Will the parking lot have multiple entry and exit gates or just one?
2. Will a ticket be issued to the vehicle to assign the parking spot?
3. Is there payment involved ? If so then what will be the basis for payment?

-----------------------------------------------------------------------------------------------------------------------

Step 2: **Identifying and Defining Entities**

- **ParkingLot** --> This class manages multiple levels and contains entry and exit gates. Follows a singleton pattern as only one instance should be present.
- **ParkingLevel** --> This class manages the parking spots in a level. Contains a list of parking spots. 
- **ParkingSpot** --> Represents the individual parking spots. It is assigned to a vehicle and contains a type.
- **Vehicle** --> Represents different vehicle types (Bike, Car). It will be an abstract class which will be inherited by by specific type of vehicles.
- **Ticket** --> Stores spot number, entry time and assigned to a vehicle.
- **EntryGate & ExitGate** --> Entry assigns a spot and issues a ticket. Exit calculates fees and processes payments.

-----------------------------------------------------------------------------------------------------------------------
