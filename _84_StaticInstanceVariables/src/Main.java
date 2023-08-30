public class Main {
    public static void main(String[] args) {
        // Static Variables
        Dog dog = new Dog("Rex"); // Instance
        Dog anotherDog = new Dog("Fluffy"); // Instance
        System.out.println(dog.getName()); // Fluffy
        System.out.println(anotherDog.getName()); // Fluffy

        // Instance Variables
        DogInstance dogInstance = new DogInstance("Rex"); // Instance
        DogInstance anotherDogInstance = new DogInstance("Fluffy"); // Instance
        System.out.println(dogInstance.getName()); // Rex
        System.out.println(anotherDogInstance.getName()); // Fluffy
    }
}