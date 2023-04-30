import java.util.ArrayList;
import java.util.List;

public class iterate {
    public static void main(String[] args) {
        List<Integer> cos = new ArrayList<>();
        cos.add(90);
        cos.add(100);
        cos.add(110);
        cos.add(120);
        cos.add(130);
        System.out.println(cos);
        // iterate whole list
        // using for loop
        // in for we use .size for iterate list
        for (int i = 0; i < cos.size(); i++) {
            System.out.println("Element" + cos.get(i));
        }
    }

}
