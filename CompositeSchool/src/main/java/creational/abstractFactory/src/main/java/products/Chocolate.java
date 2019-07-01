package products;

public abstract class Chocolate {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String addName(){
        return this.name;
    }


    public String addFat(){
        return "adding fat..";
    }
    public String addSugar(){
         return "adding sugar..";
    }

    public String addCocoa(){
         return "adding cocoa..";
    }
}
