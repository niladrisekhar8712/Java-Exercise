public class Antique extends ProductForSale{

    public Antique(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "+type+" ("+getClass().getSimpleName()+")");
        System.out.println("Price: "+price);
        System.out.println("Description: "+description);
    }
}
