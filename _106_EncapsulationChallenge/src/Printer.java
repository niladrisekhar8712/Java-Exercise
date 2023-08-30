public class Printer {
    public int tonerLevel;//
    public int pagesPrinted;
    public boolean duplex;//

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        if(tonerLevel>100 || tonerLevel<0){
            return -1;
        }
        return tonerLevel;
    }
    public int printPages(int pagesToBePrinted){
        int sheet;
        if(duplex){
            System.out.println("It is a duplex Printer");
            sheet = 2*pagesToBePrinted;
        }
        else sheet = pagesToBePrinted;
        pagesPrinted += sheet;
        return sheet;
    }
}
