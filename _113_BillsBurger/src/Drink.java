public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        if(size.toLowerCase().charAt(0) == 's'){
            this.price = 20;
        } else if (size.toLowerCase().charAt(0) == 'm') {
            this.price = 50;
        }
        else this.price = 85;
    }

    public Drink() {
        this("Coke","small");
        this.price = 20;
    }
}
