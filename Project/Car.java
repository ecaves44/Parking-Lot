package projectpractice;


public class Car extends Vehicle {
    
    @Override
    String getNumberOfSpots() {
        return " ";
    }
    //if ParkingLot park method, boolean canPark is true, then replace the 
    //string
    
    @Override //should override Vehicle's getSpotsNeeded abstract method
    public int getSpotsNeeded(){
        int number = 1; //only need 1 spot for Car
        return number;
    }

    @Override
    public String getSize() {
        return "C";
    }
  
}
