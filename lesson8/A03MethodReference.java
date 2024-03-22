package lesson8;

import java.util.List;
import java.util.function.Predicate;

public class A03MethodReference {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        Predicate<SalesTxn> ca = t -> t.getState().equals(State.CA);


        System.out.println("\nCA Transations");
        tList.stream()
                .filter(t -> t.getState().equals(State.CA))
                .forEach(t -> t.printSummary());

//        tList.stream()
//                .filter(t -> t.getState().equals(State.CA))
//                .forEach(SalesTxn::printSummary);

        tList.stream()
                .filter(ca)
                .forEach(SalesTxn::printSummary);
    }
}
