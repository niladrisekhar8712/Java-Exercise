import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Dog dog = new Dog("Wolf","big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shepherd","big",150));
        animals.add(new Fish("GoldFish","small",1));
        animals.add(new Fish("Barracuda","big",75));
        animals.add(new Dog("Pug","small",20));
        animals.add(new Horse("Clydesdale","large",1000));
        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }
    }
    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}