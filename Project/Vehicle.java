
package projectpractice;


public abstract class Vehicle {

    private Spot[] spots = new Spot[10]; //variable and array spot of class Spot
    private boolean isAvailable; //object of type Spot
    Car c;
    private String size;
    private String newLot;
    ParkingLot p;
        
    public abstract int getSpotsNeeded();

    abstract String getNumberOfSpots();
    
    public abstract String getSize();
       
    public void add(Spot s){
        for (int i = 0; i < spots.length; i++){
            spots[i] = s;
        }
    }
       
    public void setSize(String size){
        this.size = size;
    }
      
    public void setSpot(Spot[] spots){ //sets and stores certain spot
        this.spots = spots;
    }
    
    public Spot[] getSpot(){
        return spots;
    }
}
