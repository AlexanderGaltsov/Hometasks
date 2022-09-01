public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = sales[0];
        for (long sale : sales)  {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long highsNumber() {
        int highsNumber = 0;
        for (long sale : sales) {
            if (sale == max()) {
                highsNumber += 1;
            }
        }
        return highsNumber;
    }
    public long lowsNumber() {
        int lowsNumber = 0;
        for (long sale : sales) {
            if (sale == min()) {
                lowsNumber += 1;
            }
        }
        return lowsNumber;
    }
    public long averageTrimmedSales() {
        long sum = 0;
        for(long sale : sales) {
            sum += sale;
        }
        return
                (sum - (max() * highsNumber()) - (min() * lowsNumber()))
                        / (sales.length - highsNumber() - lowsNumber());
    }
}
