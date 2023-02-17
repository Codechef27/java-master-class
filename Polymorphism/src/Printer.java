public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer(10, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100 ) {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            }
            tonerLevel += tonerAmount;
            return tonerLevel;
        } else return -1;
    }

    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
