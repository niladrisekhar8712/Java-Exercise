import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Fish extends Animal{
    private int fins;
    private int gills;


    public Fish(String type, int weight, int gills, int fins) {
        super(type, "Small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.print("Muscles moving ");
    }
    private void moveBackFins(){
        System.out.print("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
