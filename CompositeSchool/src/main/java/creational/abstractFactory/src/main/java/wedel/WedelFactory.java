package wedel;

import chocoFactory.ChocoFactory;
import products.ChocoType;
import products.Chocolate;
import products.Ptasie;

public class WedelFactory implements ChocoFactory {


    Chocolate chocolate=null;

    public Chocolate createChocolate(ChocoType type) {
        if(type.equals(ChocoType.DARK))
        {
            return new WedelDark();

        } else if(type.equals(ChocoType.MILK))
        {
            return new WedelMilk();

        }else if (type.equals(ChocoType.NUT)){
            return new WedelNut();
        }

        return chocolate;
    }

    public Ptasie createPtasie() {
        return null;
    }
}
