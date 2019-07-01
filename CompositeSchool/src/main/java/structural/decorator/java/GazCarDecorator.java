package structural.decorator.java;



public class GazCarDecorator extends CarDecorator {

    public GazCarDecorator(Car carToBeDecorated){
        super(carToBeDecorated);
    }

    public int getCost() {
        int cost = super.getCost();
        return cost+2000;
    }

    public String getDescription() {
        String description = super.getDescription();
        return description + " + gaz";
    }


}
