public class Main {
    public static void main(String[] args) {
        long[] sales = {100,30,410,15};

        SalesManager manager = new SalesManager(sales);
        System.out.println("Max:" + manager.max());
        System.out.println("Min:" + manager.min());

        SalesManager day1 = new SalesManager(new int[]{35, 38, 36, 40, 39, 45, 43});
        System.out.println("Максимальное количество проданных позиций в течение дня " + day1.max() + " шт");
        System.out.println("Среднее количество проданных позиций в течение дня " + day1.average() + " шт");

    }
}
