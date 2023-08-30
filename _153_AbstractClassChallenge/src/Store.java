import java.util.LinkedList;

public class Store {
    private static LinkedList<ProductForSale> listOfProducts = new LinkedList<>();
    private static LinkedList<OrderItem> orderItems = new LinkedList<>();
    private static StringBuilder priceLine = new StringBuilder();
    private static int totalPrice = 0;
    public static void main(String[] args) {
        Antique antiquePipe = new Antique("Antique Pipe",12000,"The type of a pipe used by Sherlock Holmes");
        Antique hourGlass = new Antique("Hour Glass",10000,"An hour glass from 1600s");
        Antique elegantMask = new Antique("Elegant Mask",8000,"Mask used in 1950s Halloween Party");
        Antique elegantNecklace = new Antique("Elegant Necklace",20000,"Necklace used by Queen Of England");
        Antique vintageCompass = new Antique("Vintage Compass",15000,"Sailors from 1800s used this compass to find their way in the vast sea");
        Stone ruby = new Stone("Ruby",2000,"Rubies of Rubbish makes no difference");
        Stone diamond = new Stone("Diamond",10000,"Ah! I'll sell that at a high price");
        Stone velvetBlue = new Stone("Velvet Blue",7000,"Look at this piece of beauty");
        listOfProducts.add(antiquePipe);
        listOfProducts.add(hourGlass);
        listOfProducts.add(elegantMask);
        listOfProducts.add(elegantNecklace);
        listOfProducts.add(vintageCompass);
        listOfProducts.add(ruby);
        listOfProducts.add(diamond);
        listOfProducts.add(velvetBlue);
        System.out.println("Details: ");
        for(var productForSale : listOfProducts){
            productForSale.showDetails();
        }
        addOrder(antiquePipe,2);
        addOrder(hourGlass,1);
        addOrder(elegantMask,2);
        addOrder(elegantNecklace,1);
        addOrder(vintageCompass,2);
        addOrder(ruby,6);
        addOrder(velvetBlue,2);
        addOrder(diamond,3);
        getReceipt();
    }
    private static void addOrder(ProductForSale productForSale, int quantity){
        OrderItem orderItem = new OrderItem(quantity,productForSale);
        orderItems.add(orderItem);
        priceLine.append(productForSale.pricedLineItem(quantity)).append("\n");
        totalPrice += productForSale.getSalesPrice(quantity);
    }
    private static void getReceipt(){
        System.out.println(priceLine.toString());
        System.out.println("Total Price: "+totalPrice);
    }
}