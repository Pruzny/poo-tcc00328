package questao02;

import com.sun.source.tree.Tree;

import java.util.*;

public class Conversor {

    public static void converter() {
//        ArrayList<String> al = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        System.out.printf("%s\n\n", al);

        HashSet<String> hs = new HashSet<>(al);
        System.out.printf("%s\n\n", hs);

        PriorityQueue<String> pq = new PriorityQueue<>(hs);
        System.out.printf("%s\n\n", pq);

        ArrayDeque<String> ad = new ArrayDeque<>(pq);
        System.out.printf("%s\n\n", ad);

        TreeSet<String> ts = new TreeSet<>(ad);
        System.out.printf("%s\n\n", ts);
    }
}
