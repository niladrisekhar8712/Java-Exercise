/*
PersonalComputer inherits from Product.
But a PersonalComputer, in addition to being a product, is actually made up of other products.
Composition is actually modelling parts, and those parts make up a greater whole.
In this case we're going to model the personal computer..
we're modelling the has a relationship, with the motherboard,the case, and the monitor.
 */
public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixel(int x, int y, String color){
        System.out.println(String.format("Drawing Pixel at %d %d in color %s",x,y,color));
    }
}
class MotherBoard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is now loading...");
    }
}
class ComputerCase extends Product{
    private int powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, int powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }
}