public class EnhancedPrinter {
    private int tonerLevel;//
    private int pagesPrinted;
    private boolean duplex;//

    public EnhancedPrinter(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel<=100 && tonerLevel>=0) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        if(tonerLevel>100 || tonerAmount<0){
            return -1;
        }
        return tonerLevel;
    }
    public int printPages(int pagesToBePrinted){
        int sheet;
        if(duplex){
            System.out.println("It is a duplex Printer");
            sheet = pagesToBePrinted/2 +pagesToBePrinted%2;
        }
        else sheet = pagesToBePrinted;
        pagesPrinted += sheet;
        return sheet;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
