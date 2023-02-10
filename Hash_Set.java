import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();

        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(4);
        System.out.println(h1);

        System.out.println("Size of the set is: "+h1.size());

        if(h1.contains(1)){
            System.out.println("1 is Present");
        }

        if(!h1.contains(6)){
            System.out.println("6 is Absent");
        }

        h1.remove(1);
        if(!h1.contains(1)) {
            System.out.println("absent 1");
        }

        System.out.println(h1);

        h1.add(0);
        Iterator it = h1.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
        if(!h1.isEmpty()){
            System.out.println("Set is not Empty");
        }
    }
}
