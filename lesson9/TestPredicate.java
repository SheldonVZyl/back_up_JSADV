package lesson9;

import lesson9.SalesTxn;
import lesson9.State;

import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        Predicate<SalesTxn> massSales =
                t -> t.getState().equals(State.MA);

        System.out.println("\nSales - Stream");
        tList.stream()
                .filter(massSales)
                .forEach(t -> t.printSummary());

        System.out.println("\nSales - Method Call");
        for (SalesTxn t : tList) {
            if (massSales.test(t)) {
                t.printSummary();
            }
        }
    }
}
