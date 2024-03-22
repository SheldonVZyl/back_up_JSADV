package lesson8;

import java.util.*;
import java.util.function.Predicate;

public class RoboCallTest08 {
    public static void main(String[] args) {
        List<Person> p1 = Person.createShortList();
        RoboCall05 robo = new RoboCall05();

        Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;

        System.out.println("\nCalling all drivers lambda");

        p1.stream()
                .filter(allPilots)
                .forEach(p -> robo.roboCall(p));
    }
}
