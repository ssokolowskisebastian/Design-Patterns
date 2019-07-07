package creational.abstractFactory2;

public class SeaAnimalFactory extends AnimalFactory {
    Animal getAnimal(String a){
        Animal animal=null;
        if(a.equals("shark")){
            animal=new Shark();
        }else if(a.equals("octopus")){
            animal=new Octopus();

        }
        return animal;
    }
}
