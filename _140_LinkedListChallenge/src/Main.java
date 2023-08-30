import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trip trip = new Trip();
        String choice;
        Scanner ch = new Scanner(System.in);
        ListIterator<Town> listIterator = trip.getListTown().listIterator();
        options();
        while(true){
            System.out.println("Enter your choice: ");
            choice = ch.nextLine();
            switch (choice.toUpperCase().charAt(0)) {
                case 'F' -> {
                    if (listIterator.hasNext()) {
                        var town = listIterator.next();
                        if(trip.getListTown().indexOf(town)==0){
                            System.out.println("Starting your trip enjoy Your journey");
                        }else System.out.println("Now visiting " + town.getName() + " " + town.getDistanceFromSydney() + " away from Sydney");
                    } else System.out.println("End of trip");
                }
                case 'B' -> {
                    if (listIterator.hasPrevious()) {
                        var town = listIterator.previous();
                        if(trip.getListTown().indexOf(town)==0) {
                            System.out.println("We have returned to Sydney");
                        }
                        else System.out.println("Now visiting " + town.getName() + " " + town.getDistanceFromSydney() + " away from Sydney");
                    } else System.out.println("We are at Sydney");
                }
                case 'L' -> {
                    for (Town town : trip.getListTown()) {
                        System.out.println(town.getName() + " " + town.getDistanceFromSydney());
                    }
                }
                case 'M' -> options();
                case 'Q' -> System.exit(0);
                default -> System.out.println("Invalid Input");
            }
        }
    }
    private static void options(){
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
    }
}