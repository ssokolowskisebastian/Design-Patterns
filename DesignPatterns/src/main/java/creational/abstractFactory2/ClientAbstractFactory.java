package creational.abstractFactory2;

public class ClientAbstractFactory {

    public static void main(String[] args) {
        AnimalFactory animalFactory;
        Animal animal=null;

        animalFactory=AnimalFactory.getAnimalFactory("sea");
        animal=animalFactory.getAnimal("shark");
        System.out.println( animal.speak());

    }
}
