import java.util.Comparator;
import java.util.PriorityQueue;

public class comparatorreverseorder {
    public static void main(String[] args) {
        PriorityQueue<Integer> shiv = new PriorityQueue<>(Comparator.reverseOrder());
        // using Comparator.reverseOrder() we can change the min heap to max heap

        shiv.offer(32);
        shiv.offer(34);
        shiv.offer(65);
        shiv.offer(87);
        shiv.offer(90);
        shiv.offer(19);
        shiv.offer(65);
        shiv.offer(67);
        System.out.println(shiv);
        System.out.println(shiv.peek());
        System.out.println(shiv.poll());
        System.out.println(shiv);
        

    }
}