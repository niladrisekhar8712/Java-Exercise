public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("Blue"); //Instance
        House anotherHouse = blueHouse; //Reference... anotherHouse points to the blueHouse
        System.out.println(blueHouse.getColour()); // Blue
        System.out.println(anotherHouse.getColour()); // Blue
        anotherHouse.setColour("Red");
        System.out.println(blueHouse.getColour()); // Red
        System.out.println(anotherHouse.getColour()); // Red
        House greenHouse = new House("Green"); //Instance
        anotherHouse = greenHouse; // Reference... now anotherHouse points to greenHouse
        System.out.println(greenHouse.getColour()); // Green
        System.out.println(anotherHouse.getColour()); // Green
        System.out.println(blueHouse.getColour()); // Red
    }
}