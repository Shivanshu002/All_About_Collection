import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        int[] shiv = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = Arrays.binarySearch(shiv, 9);
        // .binarySearch() only work for sorted array
        System.out.println("The index of element 4 in array is" + index);
        // if you want to sort an Array then we can use Array.sort(); function and
        // for(){} is use for Iteration
        Arrays.sort(shiv);
        for (int i : shiv) {
            System.out.print(i + " ");
            // if you want to fill th Array with new value then we can use Arrays.fill()
            // function.
        }
        Arrays.fill(shiv, 11);
        System.out.println(shiv);

    }
}
