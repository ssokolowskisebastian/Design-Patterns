package creational.abstractFactory2;

public abstract class AnimalFactory {


    abstract Animal getAnimal(String animalType);




    static AnimalFactory getAnimalFactory(String af){
        AnimalFactory animalFactory=null;
        if(af.equals("sea")){
            animalFactory=new SeaAnimalFactory();
        }else if(af.equals("land")){
            animalFactory=new LandAnimalFactory();

        }
        return animalFactory;
    }
}
