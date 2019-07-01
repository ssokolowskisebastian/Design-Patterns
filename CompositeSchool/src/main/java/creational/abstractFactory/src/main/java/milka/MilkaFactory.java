package milka;

import chocoFactory.ChocoFactory;
import products.ChocoType;
import products.Chocolate;
import products.Ptasie;

public class MilkaFactory implements ChocoFactory {


    Chocolate chocolate=null;

    public Chocolate createChocolate(ChocoType type) {
        if(type.equals(ChocoType.DARK))
        {
            return new milka.MilkaDark();


        } else if(type.equals(ChocoType.MILK))
        {
            return new milka.MilkaMilk();

        }else if (type.equals(ChocoType.NUT)){
            return new milka.MilkaNut();
        }

        return chocolate;
    }

    public Ptasie createPtasie() {
        return null;
    }
}
