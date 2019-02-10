package creditCardMask;

public class Maskify {

    /**
     * My first attempt
     */
    public static String maskify(String str) {
        if (str == null) return null;

        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1, j = 4; i >= 0; i--) {
            if (j > 0) {
                result.append(str.charAt(i));
                j--;
            }
            else result.append("#");
        }
        return result.reverse().toString();
    }

    /**
     * Best solution from site
     */
    public static String maskifyB(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}
