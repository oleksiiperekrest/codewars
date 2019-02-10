package youreASquare;


public class Program {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        change(ints);
        for (int i : ints)
            System.out.println(i);


    }

    private static void change (int[] arr) {
        arr[0] = 6;
    }
}
