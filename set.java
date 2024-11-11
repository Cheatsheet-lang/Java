import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> sset = new TreeSet<Integer>();

        // Adding elements into the set
        set.add(6);
        set.add(7);
        set.add(10);
        set.add(10);
        set.add(54);
        set.add(87);
        set.add(54);
        set.add(43);

        sset.addAll(set);

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        
        for (int s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        set.remove(7);
        System.out.println("Set: " + set);
        System.out.println("Sorted Set: " + sset);
    }
}
