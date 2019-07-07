package structural.compositeDeveloper;

public class CppDeveloper implements Developer {

    String developerName;

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String writeCode() {
        return this.developerName+" C++ ";
    }
}
