public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed == "slow"){
            System.out.println(getExplicitType()+" lazily swimming");
        } else if (speed == "fast") {
            System.out.println(getExplicitType()+" running");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "GoldFish"){
            System.out.println("swish "+ getExplicitType());
        }
        else System.out.println("splash! "+getExplicitType());
    }
}
