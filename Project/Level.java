package projectpractice;


class Level {
    
    private int levelNumber;
    private Spot[] spots = new Spot[30];
    
    public Level(int levelNumber, int spotsNumber) //constructor of Level class        
    {        
        spotsNumber = 30; //number of spots
        this.levelNumber = levelNumber;
        
        double large = .2 * spotsNumber; //20 percent of 30 spots is large
        double motorcycle = .2 * spotsNumber; //20% of 30 is motor.

        int l = (int) large; //6 large spots
        int m = (int) motorcycle; //6 motorcycle spots
        int c = spotsNumber - (l + m); //18 regular car spots
        //total of 30 spots in 1 level out of 5 levels
        int row;

        for (int i = 0; i < spotsNumber; i++)
        {
            row = i / 10;
            if (i < l) //i < 6
                spots[i] = new Spot(this, "l", i, row); //creating large spots
            else if (i < l + c) //from 6 to i < 24         
                spots[i] = new Spot(this, "c", i, row); //creating compact spots        *****note: when switched 'c' with 'C', the boolean park methods****
            else  //after l and c spots, from 24 to i < 30                              *****did not return false*****
                spots[i] = new Spot(this, "m", i, row); //creating motorcycle spots            
        }
    }
    
    public boolean park(Vehicle v){
        boolean canPark = false;  
        String vSize = v.getSize();
        int vSpotNeeded = v.getSpotsNeeded();
        
        for (int i = 0; i < spots.length; i++){     //going over 30 spots,
           if (spots[i].isAvailable()){                  //if v is null or not, true or false //if "c" equals "C", "m" equals "M", "l" equals "L"   
              if (spots[i].getSize() == "c" && vSize == "C"){
                      return spots[i].park(v);
                  }
              else if (spots[i].getSize() == "c" && vSize == "M"){
                      return spots[i].park(v);
                  }
              else if (spots[i].getSize() == "m" && vSize == "M"){
                      return spots[i].park(v);
                  }
              else if (spots[i].getSize() == "l" && vSize == "C"){
                      return spots[i].park(v);
                  }
              else if (spots[i].getSize() == "l" && vSize == "M"){
                      return spots[i].park(v);
                  }
           if(vSpotNeeded > 1){
                  return check(i,vSpotNeeded, v);
              }
           }        
        }
        return canPark;

    }
    public boolean check(int start, int numOfSpots, Vehicle v){
        boolean park = false;
        Spot[] s = new Spot[numOfSpots];
        for (int i = start+1; i < numOfSpots; i++){
           if(spots[i].isAvailable() && spots[i].getSize() == "l"){
                park = true;
                s[i]  = spots[i];
           }else{ 
               park = false;
               break;
           }
        }
        if(park){
            for (int i = 0; i < s.length; i++){
                spots[i].park(v);
            }
            v.setSpot(s);
        }
        return park;
    }
    
    public void print(){    //print method
        for (int i = 0; i < spots.length; i++){     //looping over the spots in the level
            spots[i].print();                       //prints out the String size
            if (i == 9 || i == 19)                  //adding a space between the rows
                System.out.print(" ");       
        }
    }
 }