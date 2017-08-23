
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
//isAvailable is a method in Spot class that has a return statement of 
    //isAvailable, of true or false
    //if "spot" is available (true), then whichever spot it is, call the 
    //type of vehicle (e.g car) to "park"(replace lowercase with Uppercase)
    //soooo, should my isAvailable method of this Vehicle class be void?
//    public boolean actualPark(Car c){
////        if (s.park(this) == true){ //this refers to isAvailable,
////            c.park(c); //s refers to Spot class --> .Park method which if that
////        }   //method returns true, call the subclass Car using the c object-ref
//////        else{ //note: c.void method is ok? void --> sout.
//////            c.park(c);
//////        } //getSpotsNeeded?
////        return c.park(c);
//    }
//  