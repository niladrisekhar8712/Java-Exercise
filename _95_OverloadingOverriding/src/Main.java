public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        GermanShepherd germanShepherd = new GermanShepherd();
        dog.bark();
        dog.bark(5);
        germanShepherd.bark();

        /*Overloading
        It means providing two or more separate methods, in a class, with the same name but different
        parameters.
        Method return type may or may not be different, and that allows us to reuse the same method name.
        Overloading is very handy, it reduces duplicated code, and we don't have to remember multiple
        method names.
        We can overload static or instance methods
         */
        /*Overriding
        It means defining a method in a child class, that already exists in the parent class, with the same
        signature.
        By extending the parent class, the child class gets all the methods defined in the parent class.
        It is also known as Runtime Polymorphism, Dynamic Method Dispatch because the method that is getting
        called decided at runtime by JVM.
        It cannot have lower access modifier. If parent's method is protected then using private the the child's
        overridden method is not allowed.
        Only inherited methods can be overridden
        Constructors and private methods cannot be overridden.
        Methods that are final cannot be overridden.

         */
    }
}
class Dog{
    public void bark(){
        System.out.println("woof");
    }
    public void bark(int k){ // overloading
        for (int i = 1;i<=k;i++){
            System.out.print("woof ");
        }
        System.out.println();
    }
}
class GermanShepherd extends Dog{
    @Override
    public void bark() { // overriding
        System.out.println("woof woof woof");
    }
}