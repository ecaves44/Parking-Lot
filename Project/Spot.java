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
