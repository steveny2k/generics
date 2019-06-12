package arraystuff;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Ex1 {

    // potential "Heap Pollution", values is array of Object, but shouldn't be...
    // if you're sure your args are "well handled" use @SafeVarArgs
    public static <E> void doStuff(E ... values) {}
    
    public static <E> E[] listToArray(List<E> le, Class<? super E> cl) {
        E[] res = (E[])Array.newInstance(cl, le.size());
        for (int idx = 0; idx < le.size(); idx++) {
            res[idx] = le.get(idx);
        }

        return res;
    }

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");

        String [] res = listToArray(ls, String.class);

        System.out.println("Type of array is " + res.getClass().getName());
        for (String s : res) {
            System.out.println("> " + s);
        }
    }
}
