package creational.abstractFactory2;

public class LandAnimalFactory extends AnimalFactory {

    Animal getAnimal(String a){
        Animal animal=null;
        if(a.equals("cat")){
            animal=new Cat();
        }else if(a.equals("dog")){
            animal=new Dog();

        }
        return animal;
    }
}
