import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Trip {
    private LinkedList<Town> listTown;
    private Town adelaide = new Town("Adelaide",1374);
    private Town aliceSprings = new Town("Alice Springs",2771);
    private Town brisbane = new Town("Brisbane",917);
    private Town darwin = new Town("Darwin",3972);
    private Town melbourne = new Town("Melbourne",877);
    private Town perth = new Town("Perth",3923);
    private Town sydney = new Town();

    public Trip() {
        listTown = new LinkedList<>(List.of(adelaide,aliceSprings,brisbane,perth,darwin,melbourne,sydney));
        listTown.sort(new Comparator<>() {
            @Override
            public int compare(Town o1, Town o2) {
                return (o1.getDistanceFromSydney() > o2.getDistanceFromSydney()) ? 1 : -1;
            }
        });
    }

    public LinkedList<Town> getListTown() {
        return listTown;
    }
}
