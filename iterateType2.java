import java.util.ArrayList;
import java.util.List;

public class iterateType2 {

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
        for (Integer value : cos) {
            System.out.println("foreach Value is" + value);
        }

    }
}