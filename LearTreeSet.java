
import java.util.Set;
import java.util.TreeSet;
public class LearTreeSet {
// TreeSet in java 

    public static void main(String[] args) {
        Set<Integer> shiv = new TreeSet();
        shiv.add(10);
        shiv.add(30);
        shiv.add(40);
        shiv.add(60);
        shiv.add(70);
        System.out.println(shiv);
        // using remove() function
        shiv.remove(30);
        System.out.println(shiv);
        // using contains() , its shows element present or not
        System.out.println(shiv.contains(40));
        // using isEmpaty() function , its showes list is empty or not
        System.out.println(shiv.isEmpty());
        // using .size()functions , its showes the size of list
        System.out.println(shiv.size());
        // using .clear() function , clear all list
        shiv.clear();
        System.out.println(shiv);

    }

}
