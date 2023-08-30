import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First","Second","Third"};
        var originalList = Arrays.asList(originalArray);
        System.out.println(Arrays.toString(originalArray));
        System.out.println(originalList);
        originalList.set(0,"one");
        System.out.println(Arrays.toString(originalArray));
        System.out.println(originalList);

        originalList.sort(Comparator.naturalOrder());
        System.out.println(originalList);

//        originalList.remove(0);
//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newList);
//        newList.add("Wednesday");
//        newList.remove(0);
//        System.out.println(newList);
    }
}