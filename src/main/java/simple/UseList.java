package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseList {
    public static void breakList(List ls) { // BAD!!! But potentially legacy :)
        ls.add(1, LocalDate.now());
    }

    public static void main(String[] args) {
        List<String> names = Collections.checkedList(new ArrayList<>(), String.class);

//        List<String> names = new ArrayList<>(
//                Arrays.asList("Freddy"/*, LocalDate.now()*/, "Jimmy")
//        ); // implementation is heterogenous, all based on Object
        names.add("Fred");
//        names.add(LocalDate.now());  // should this be here???
        names.add("Jim");
        names.add("Sheila");

        breakList(names);
//        String second = (String)(names.get(1));
        String second = names.get(1); // STILL HAS A CAST IN BINARY
    }
}
