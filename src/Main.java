public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Jimmy", 8,"Golden Retriever");

        dog.bark();
        dog.changeName("Fido");
        System.out.println(dog.convertToHumanAge());
    }
}
