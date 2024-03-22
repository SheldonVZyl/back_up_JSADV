package lesson7;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> partList = new ArrayList<>(3);
        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
        partList.add(new Integer(4444));
        partList.add(new Integer(5555));
        System.out.println("First element: " + partList.get(0));
        partList.add(0, new Integer(6666));
        System.out.println("First element: " + partList.get(0));
    }
}
