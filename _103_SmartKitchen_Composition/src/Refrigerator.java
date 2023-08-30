public class Refrigerator {
    private boolean hasWorkToDo;
    public Refrigerator() {
        this.hasWorkToDo = false;
    }

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering Food");
        }
        else{
            System.out.println("Doing Nothing");
        }
    }
}
