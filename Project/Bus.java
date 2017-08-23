package projectpractice;


class Bus extends Vehicle //extending to Parent
{

    public Bus() { //default constructor
    }

    @Override
    public int getSpotsNeeded() {
        return 5;
    }

    @Override
    String getNumberOfSpots() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSize() {
        return "B";
    }
    
}
