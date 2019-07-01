package structural.compositeDeveloper;

public class JavaDeveloper implements Developer {

    String developerName;

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String writeCode() {
        return this.developerName+" Java ";
    }


}
