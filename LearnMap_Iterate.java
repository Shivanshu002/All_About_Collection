import java.util.HashMap;
import java.util.Map;

public class LearnMap_Iterate {
    public static void main(String[] aegs) {
        Map<Integer, String> shiv = new HashMap<>();
        shiv.put(1, "one");
        shiv.put(2, "two");
        shiv.put(3, "three");
        shiv.put(4, "four");
        shiv.put(5, "five");
        System.out.println(shiv);
        // for iterate
        for (Map.Entry<Integer, String> en : shiv.entrySet()) {

            System.out.println(en);

            System.out.println(en.getKey());
            System.out.println(en.getValue());

        }
        // using this we are print the only key
        for (Integer key : shiv.keySet()) {
            System.out.println(key);
        }
        // using this we are print only value

        for (String value : shiv.values()) {
            System.out.println(value);
        }

    }

}
