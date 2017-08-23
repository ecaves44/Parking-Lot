package projectpractice;

class Spot {   
    
    private Level level; 
    private String size;
    private int spotNumber;
    private int row;
    Vehicle v; //v is an object that can call Vehicle's methods, v of type Veh.
    private Spot[] spots;
    //parameter for a spot that sets its level, string, spotsnumber and row
    public Spot(Level level, String size, int spotNumber, int row){
        this.level = level;         //
        this.size = size;
        this.spotNumber = spotNumber;
        this.row = row;          
   }

    public void print() { //print method, "llllllcccccccmmmmmm"
        System.out.print(getSize());
    }
    
    public boolean isAvailable(){
        if (v == null)          //checks if that spot is null or not
            return true;
        else
            return false;
    }
    
    public boolean park(Vehicle v){
        this.v = v;             //setting v
        size = v.getSize();     //sets the change, either M or C or B, depending on what v.getSize() is
        v.add(this);            //calls to Vehicle's void method
        return true;            //boolean return
    }                          

    public String getSize() {     
        return size;    //returns String of that particular spot
    }
}
   //class should be implemented, maybe under a spots loop?//switched canPark with isAvailable
       //the park method in Level class implements this method and checks if
        //this method returns true or false, and so on. Like the bus example
        //first to get on, last to get out. Lot --> Level --> Spot, etc.
        //returns 1 or 5, int type
        //ask vehicle how many spot you need, int?
//        getSpot(); //getting how many spots you need, now look for it
        //sout newLot?