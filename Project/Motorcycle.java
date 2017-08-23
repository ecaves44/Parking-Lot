
package projectpractice;

class Motorcycle extends Vehicle {

    public Motorcycle() {
    }
    
    @Override
    String getNumberOfSpots() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSpotsNeeded() {       //more like get type
        return 2;    //2 is used to distinguish motorcycle from car
    }

    @Override
    public String getSize() {
        return "M";
    }
    
}
