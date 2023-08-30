public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater(){
        brewMaster = new CoffeeMaker(true);
        brewMaster.brewCoffee();
    }
    public void pourMilk(){
        iceBox = new Refrigerator(true);
        iceBox.orderFood();
    }
    public void loadDishWasher(){
        dishWasher = new DishWasher(true);
        dishWasher.doDishes();
    }
    public void setKitchenState(boolean setRefrigerator, boolean setDishWasher, boolean setCoffeeMaker){
        brewMaster = new CoffeeMaker(setCoffeeMaker);
        iceBox = new Refrigerator(setRefrigerator);
        dishWasher = new DishWasher(setDishWasher);
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishWasher();
    }
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
