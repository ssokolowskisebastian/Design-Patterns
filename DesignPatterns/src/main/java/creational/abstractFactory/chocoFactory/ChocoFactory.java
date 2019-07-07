package chocoFactory;

import products.ChocoType;
import products.Chocolate;
import products.Ptasie;

public interface ChocoFactory {

    Chocolate createChocolate(ChocoType type);
    Ptasie createPtasie();
}
