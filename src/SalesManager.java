public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = sales[0];
        for (int sale : sales)  {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int highsNumber() {
        int highsNumber = 0;
        for (int sale : sales) {
            if (sale == max()) {
                highsNumber += 1;
            }
        }
        return highsNumber;
    }
    public int lowsNumber() {
        int lowsNumber = 0;
        for (int sale : sales) {
            if (sale == min()) {
                lowsNumber += 1;
            }
        }
        return lowsNumber;
    }
    public int averageTrimmedSales() {
        int sum = 0;
        for(int sale : sales) {
            sum += sale;
        }
        return
                (sum - (max() * highsNumber()) - (min() * lowsNumber()))
                        / (sales.length - highsNumber() - lowsNumber());
    }
}
