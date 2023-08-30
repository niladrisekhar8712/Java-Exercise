public class Town {
    private String name;
    private int distanceFromSydney;

    public Town(String name, int distanceFromSydney) {
        this.name = name;
        this.distanceFromSydney = distanceFromSydney;
    }

    public Town() {
        this("Sydney",0);
    }

    public String getName() {
        return name;
    }

    public int getDistanceFromSydney() {
        return distanceFromSydney;
    }
}
