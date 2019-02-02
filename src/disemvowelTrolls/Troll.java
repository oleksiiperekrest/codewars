package disemvowelTrolls;


public class Troll {
    public static String disemvowel(String str) {

        String vowels = "AaEeIiOoUu";
        for (char c : str.toCharArray()) {
            if (vowels.contains(String.valueOf(c)))
                str = str.replace(String.valueOf(c), "");
        }
        return str;
    }

    public static String disemvowelOneLine(String str) {
        return str.replaceAll("(?i)[aeiou]" , "");
    }

}
