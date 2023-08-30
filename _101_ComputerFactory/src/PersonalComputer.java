// Composition is a way to make the combination of classes, act like a single coherent object.
public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
    private void drawLogo(){
        monitor.drawPixel(1200,50,"yellow");
    }
    public void power(){
        computerCase.pressPowerButton();
        drawLogo();
    }
}
