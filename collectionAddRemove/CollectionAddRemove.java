package com.veinik.collectionAddRemove;

import java.util.*;

public class CollectionAddRemove {
    public static void main(String[] args) {

        System.out.println("     Add Objects");
        Collection c = new ArrayList();
        CalcAdd(c);
        Collection c1 = new LinkedList();
        CalcAdd(c1);
        Collection c2 = new TreeSet();
        CalcAdd(c2);
        Collection c3 = new HashSet();
        CalcAdd(c3);

        System.out.println("     Remove Objects");
        Collection b = new ArrayList();
        CalcRemove(b);
        Collection b1 = new LinkedList();
        CalcRemove(b1);
        Collection b2 = new TreeSet();
        CalcRemove(b2);
        Collection b3 = new HashSet();
        CalcRemove(b3);
    }

    public static void CalcAdd(Collection c) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            c.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

    public static void CalcRemove(Collection b) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            b.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
