import java.util.ArrayList;
import java.util.List;

public class getFunction {
    public static void main(String[] args) {
        List<Integer> sampleNumber = new ArrayList();
        sampleNumber.add(100);
        sampleNumber.add(101);
        sampleNumber.add(102);
        sampleNumber.add(103);
        System.out.println(sampleNumber);

        // using this get function we can find specific element which you want to search
        System.out.println(sampleNumber.get(3));

    }

}
