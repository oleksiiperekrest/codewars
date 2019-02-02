package YoureASquare;

public class Square {

    /**
     * My first attempt
     */
    public static boolean isSquare(int n) {
        if (n < 0) {
            System.out.println("negative numbers aren't square numbers");
            return false;
        }

        int sqrt = (int) Math.sqrt(n);
        if ((sqrt * sqrt) == n) {
            System.out.println(n + " is a square number (" + sqrt + " * " + sqrt + ")");
            return true;
        }

        else {
            System.out.println(n + " isn't a square number");
            return false;
        }
    }

    /**
     * Best solution from site.
     */
    public static boolean isSquareB(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
