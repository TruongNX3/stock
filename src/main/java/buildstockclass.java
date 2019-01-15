public class buildstockclass {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public buildstockclass() {

    }

    public buildstockclass(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(double currentPrice, double previousClosingPrice) {
        return 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}
