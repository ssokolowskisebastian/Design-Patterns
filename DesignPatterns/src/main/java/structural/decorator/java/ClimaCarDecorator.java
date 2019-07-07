package structural.decorator.java;



public class ClimaCarDecorator extends CarDecorator {

    public ClimaCarDecorator (Car carToBeDecorated){
        super(carToBeDecorated);
    }

    public int getCost() {
        int cost = super.getCost();
        return cost+1000;
    }

    public String getDescription() {
        String description = super.getDescription();
        return description + " + klima";
    }


}
