class codingChallenge {
    public static void main(String[] args) {
        String[] fruits = { "apple", "banana", "grapes", "cherry", "date" };
        for (int i = 0; i < fruits.length; i++) {
            if (i == 2 || i == 4) {
                continue;
            }
            System.out.println(fruits[i] + " ");
        }

    }
}