public class Main {

    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new int[]{30, 12, 214, 85, 12, 56, 12, 214,});

        System.out.println("Максимальное число продаж " + salesManager.max());
        System.out.println("Расчет обрезанного среднего продаж " + salesManager.averageTrimmedSales());
    }
}
