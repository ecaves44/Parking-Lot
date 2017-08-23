package projectpractice;

//Esau Cuevas
//CS 2336.003
//To run the program, call p.print(): for default parking lot
//then on the next line p.parks(new VehicleType()) and the next line, call 
//p.print(); again and it will show the change

class ParkingLot {
    Level[] level = new Level[5]; //an array of levels (5) called level
    
    public ParkingLot(){        
        for (int i = 0; i < level.length; i++){ //going over 5 times
                level[i] = new Level(i, 30); //i = levels, 30 = spots per level
            }
    }
    
    public void print(){        
        for (int i = 0; i < level.length; i++){ //creating parking lot
            System.out.print("Level" + i + ": "); //In the beginning of the level, String + i will output each level0, level1, etc 
            level[i].print();       //print out the levels, calling the level print method
            System.out.println();   //goes to next line
        }
    }
    
    public boolean parks(Vehicle v){
        boolean canParks = false;
        System.out.println("");     //creating a line of space
        for (int i = 0; i < level.length; i++){
            canParks = level[i].park(v);        //checks if theres a spot in each level, if not, then go to next level and so on
            if (canParks){                      //if true or false
                return canParks;                
            }                                   //now put in a parking failed state if there is no parking spot in any of the levels
        }
        System.out.print("Parking failed- final state");
        System.out.println();   //goes to next line
        return canParks;
    }
}