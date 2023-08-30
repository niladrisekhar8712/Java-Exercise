import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice Springs");
        list.add("Brisbane");
        list.add("Darwin");
        list.add("Canberra");
        list.add("Sydney");
        list.add("Hobart");
        list.add("Melbourne");
        list.add("Toowoomba");
        printItinerary(list);
    }
    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at: "+list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From "+previousTown +" To "+town);
            previousTown = town;
        }
        System.out.println("Trip ends at: "+list.getLast());
    }
}