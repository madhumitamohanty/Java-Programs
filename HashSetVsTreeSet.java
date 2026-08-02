import java.util.*;

public class HashSetVsTreeSet {
    public static void main(String[] args) {

        // ----------- HashSet -----------
        HashSet<Integer> hashSet = new HashSet<>();

        // Adding elements (including duplicates)
        hashSet.add(50);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(40);
        hashSet.add(20); // duplicate
        hashSet.add(30); // duplicate

        System.out.println("HashSet elements:");
        System.out.println(hashSet);

        // ----------- TreeSet -----------
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding same elements
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(20); // duplicate
        treeSet.add(30); // duplicate

        System.out.println("\nTreeSet elements (sorted):");
        System.out.println(treeSet);
    }
}