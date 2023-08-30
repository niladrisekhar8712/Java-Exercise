public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",400);
        doAnimalStuff(animal,"slow");
        Dog dog = new Dog();
        doAnimalStuff(dog,"fast"); // we are passing Dog object as an Animal parameter, and it is fine because Dog is inherited from Animal
        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever = new Dog("Labrador Retriever",65,"Floffy","Swimmer");
        doAnimalStuff(retriever,"slow");
        Dog wolf = new Dog("Wolf",40);
        doAnimalStuff(wolf,"slow");
        Fish goldie = new Fish("GoldFish",1,2,3);
        doAnimalStuff(goldie,"fast");
    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}