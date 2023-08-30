public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Refrigerator refrigerator = new Refrigerator();
        DishWasher dishWasher = new DishWasher();
        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker,dishWasher,refrigerator);
        smartKitchen.addWater();
        smartKitchen.pourMilk();
        smartKitchen.loadDishWasher();
        System.out.println();
        smartKitchen.setKitchenState(true,true,false);
        System.out.println();
        smartKitchen.doKitchenWork();
    }
}