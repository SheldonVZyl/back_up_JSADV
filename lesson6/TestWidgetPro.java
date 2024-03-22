package lesson6;

public class TestWidgetPro {
    public static void main(String[] args) {
        WidgetPro wp = new WidgetPro(1000, 200, 300L, "BigWidget");
        System.out.println(wp.calcProfit());
        wp.printItemReport();


    }
}
