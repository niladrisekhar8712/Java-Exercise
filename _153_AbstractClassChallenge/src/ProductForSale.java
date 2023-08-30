public abstract class ProductForSale {
    protected String type;
    protected int price;
    protected String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public int getSalesPrice(int quantity){
        return price*quantity;
    }
    public String pricedLineItem(int quantity){
        return (quantity+" x "+type+" ---> "+quantity+" x "+price+" = "+getSalesPrice(quantity));
    }
    public abstract void showDetails();
}
