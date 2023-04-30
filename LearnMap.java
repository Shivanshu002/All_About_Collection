import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> shiv = new HashMap<>();
        // in this Map for adding the key value pair using .put() function
        shiv.put("kanpur ", 78);
        shiv.put("Lucknow ", 32);
        shiv.put("Unnao ", 39);
        shiv.put("Noida ", 16);
        shiv.put("Kondali ", 14);
        System.out.println(shiv);
        // we can not add duplicate key value pair ,when we try for add its alwayes
        // override the value
        // lets try this
        shiv.put("kanpur", 90);
        System.out.println(shiv);
        // here you saw the output now kanpur=90
        // if you dont want to update key value pair then we can use check (if ).

        // if (!shiv.containsKey("kanpur")) {
        // shiv.put("kanpur", 90);

        // }
    }

}
