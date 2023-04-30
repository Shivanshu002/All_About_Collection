import java.util.ArrayList;
import java.util.List;

public class addfunction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(0);
        System.out.println(list);

        // using this .add function we can add element in list
        list.add(10000);
        System.out.println(list);

        // using this .add(index, element); function we can add element in list
        // with proper index number where you want to add element
        list.add(4, 500);
        System.out.println(list);

        // in this we can add list in list
        List<Integer> newlist = new ArrayList();
        newlist.add(150);
        newlist.add(200);
        newlist.add(250);
        newlist.add(300);
        // this is function of adding tha list (old list name.addAll(new list name));
        list.addAll(newlist);
        System.out.println(list);

    }
}
