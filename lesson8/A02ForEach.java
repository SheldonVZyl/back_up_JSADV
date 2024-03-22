package lesson8;

import java.util.List;

public class A02ForEach {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("\nPrice List with ForEach");
//        tList.forEach(t -> t.printSummary());

        tList.forEach(t -> System.out.println(
                "ID: " + t.getTxnId() + " Seller: " + t.getSalesPerson()
                        + " Buyer: " + t.getBuyerName() + " Amt: " + t.getTransactionTotal()
        ));
    }
}
