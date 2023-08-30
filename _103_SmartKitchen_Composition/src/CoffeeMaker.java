public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker() {
        this.hasWorkToDo = false;
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
        }
        else{
            System.out.println("Doing Nothing");
        }
    }
}
