package shopping;

import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;

public class UsePair {
    public static void main(String[] args) {
        Pair<String> names = new Pair<>("Fred", "Jones");
//        names.setRight(LocalDate.now());
        names.setRight("Smith");
        String first = names.getLeft();

        Pair<Object> nums = new Pair<>(99, "Fred");

        MatchablePair<String> mps =
                new MatchablePair<>("Fred", "Alan",
                        (a, b) -> a.length() == b.length());

        System.out.println("elements 'match'? " + mps.isMatched());
        mps.setMatchCriterion((a, b) -> a.equals(b));
        System.out.println("elements 'match'? " + mps.isMatched());
    }
}
