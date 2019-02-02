package disemvowelTrolls;

public class Program {
    public static void main(String[] args) {
        String str = "This website is for losers LOL!";
        str = Troll.disemvowel(str);
        System.out.println(str);
    }
}
