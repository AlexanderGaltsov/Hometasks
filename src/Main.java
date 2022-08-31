public class Main {

    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new long[]{30, 12, 26, 85, 52, 56, 95, 214,});

        System.out.println("Максимальное число продаж " + salesManager.max());
    }
}
