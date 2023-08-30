public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell",240);
        Monitor monitor = new Monitor("27inchBeast","Acer",27,"2560 x 1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.4");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,monitor,theMotherBoard);
//        thePC.getMonitor().drawPixel(10,10,"red");
//        thePC.getMotherBoard().loadProgram("Windows 11");
//        thePC.getComputerCase().pressPowerButton();
        thePC.power();
    }

}