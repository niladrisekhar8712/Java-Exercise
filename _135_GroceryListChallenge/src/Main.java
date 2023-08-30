import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> groceryList = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        Scanner itemChoice = new Scanner(System.in);
        do{
            System.out.println("Press: ");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list");
            System.out.println("2 - to remove item(s) to list");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter item(s) delimited by comma: ");
                    String items = itemChoice.nextLine();
                    addItem(items);
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println("Now List is: " + groceryList);
                }
                case 2 -> {
                    System.out.println("Enter item(s) delimited by comma: ");
                    String itemsR = itemChoice.nextLine();
                    removeItem(itemsR);
                    System.out.println("Now List is: " + groceryList);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid Input");
            }
        } while (true);
    }
    private static void addItem(String items){
        String[] itemArray = items.split(",");
        for(String s : itemArray){
            if(groceryList.contains(s)){
                continue;
            }
            groceryList.add(s);
        }
    }
    private static void removeItem(String items){
        String[] itemArray = items.split(", ");
        for(String s : itemArray){
            groceryList.remove(s);
        }
    }
}