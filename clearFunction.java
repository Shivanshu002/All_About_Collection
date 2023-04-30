import java.util.ArrayList;
import java.util.List;

public class clearFunction {
    public static void main(String[] args) {
        List<String> shiv = new ArrayList<>();
        shiv.add("rakesh");
        shiv.add("bhola");
        shiv.add("nagar");
        shiv.add("shiv");
        shiv.add("bhup");
        shiv.add("java");
        System.out.println(shiv);

        // using this .clear function we can clear the whole List
        shiv.clear();
        System.out.println(shiv);

    }

}
