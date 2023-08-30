import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String type, int weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small" : (weight<35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog() {
        super("Mutt","Big",50);
    }
    public Dog(String type, int weight){
        this(type,weight,"Perky","Curled");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    public void makeNoise(){ //overriding method
        if(type == "Wolf"){
            System.out.println("Ow Woooooo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wig their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }
        else {
            run();
            bark();
        }
        System.out.println();
    }
    private void bark(){
        System.out.print("Woof! ");
    }
    private void run(){
        System.out.print("Dog Running! ");
    }
    private void walk(){
        System.out.print("Dog Walking! ");
    }
    private void wagTail(){
        System.out.print("Tail Wagging! ");
    }
}