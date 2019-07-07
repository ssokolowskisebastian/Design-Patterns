package creational.abstractFactory;

import chocoFactory.ChocoFactory;
import milka.MilkaFactory;
import milka.MilkaMilk;
import products.ChocoType;
import products.Chocolate;

import java.util.ArrayList;

public class ClientAbstractFactory {

    public static void main(String[] args){
        ChocoFactory milkaFactory=new MilkaFactory();
        Chocolate milkaMilk= milkaFactory.createChocolate(ChocoType.MILK);

        ArrayList<String> s=new ArrayList<String>();
        s.add(milkaMilk.addCocoa());
        s.add(milkaMilk.addFat());
        s.add(milkaMilk.addSugar());
        s.add(milkaMilk.addName());

        System.out.println(s);

    }
}
