public class Dog {

    String dogName;
    int dogAge;
    String dogType;

    //constructor class
    public Dog(String dogName, int dogAge, String dogType) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogType = dogType;
    }

    // methods
    public void bark() {
        System.out.println("Woof!");
    }

    public void changeName(String newName) {
        this.dogName = newName;
        System.out.println("Dog name is now: " + this.dogName);
    }

    public int convertToHumanAge() {
        int humanAge = dogAge * 7;
        return humanAge;
    }

}
