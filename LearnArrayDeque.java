import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> shiv = new ArrayDeque();
        shiv.offer(10);
        shiv.offerFirst(20);
        // if you want to store element in first position then we use offerFrist()
        // function.
        shiv.offerLast(5);
        // if you want to store element in Last position then we use offerLast()
        // function.
        System.out.println(shiv);

        // if you want to see first element in then you can use .peekFirst() function
        System.out.println(shiv.peekFirst());
        // again if you want to see the last element then we can use .peekLast()
        // function
        System.out.println(shiv.peekLast());

        // again if you want to remove last element then we use pollLast() function
        System.out.println(shiv.pollLast());
        System.out.println(shiv);
        // again if you want to remove element in frist position then we can use
        // pollFirst() function
        System.out.println(shiv.pollFirst());
    }

}
