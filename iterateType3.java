import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterateType3 {

    public static void main(String[] args) {
        List<Integer> cos = new ArrayList<>();
        cos.add(90);
        cos.add(100);
        cos.add(110);
        cos.add(120);
        cos.add(130);
        System.out.println(cos);
        // iterate whole list
        // using for each loop
        // if you want to iterate all the element use Iterater
        Iterator<Integer> it = cos.iterator();
        while (it.hasNext()) {
            System.out.println("iterator" + it.next());
        }
    }
}
