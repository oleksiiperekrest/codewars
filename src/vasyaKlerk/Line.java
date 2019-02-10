package vasyaKlerk;

import java.util.HashMap;

/**
 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office
 * standing in a huge line. Each of them has a single 100, 50 or 25 dollars bill. An "Avengers" ticket costs 25 dollars.
 * Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
 * Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets
 * strictly in the order people follow in the line?
 * Return YES, if Vasya can sell a ticket to each person and give the change with the bills he has at hand
 * at that moment. Otherwise return NO.
 */
public class Line {

    private static HashMap<Integer, Integer> cash = new HashMap<>();

    public static String Tickets(int[] peopleInLine)
    {
        int PRICE = 25;
        cash.put(25, 0);
        cash.put(50, 0);
        cash.put(100, 0);

        if (peopleInLine[0] != PRICE) return "NO";

        for (int bill : peopleInLine) {
            if (bill == 25) {
                addOne(25);
                continue;
            }

            if (bill == 50) {
                if (cash.get(25) > 0) {
                    addOne(50);
                    subtractOne(25);
                }
                else return "NO";
            }

            if (bill == 100) {
                if (cash.get(50) > 0 && cash.get(25) > 0) {
                    addOne(100);
                    subtractOne(50);
                    subtractOne(25);
                }
                else if (cash.get(25) >= 3) {
                    addOne(100);
                    subtractOne(25);
                    subtractOne(25);
                    subtractOne(25);
                }
                else return "NO";
            }


        }

        return "YES";
    }

    private static void addOne (Integer key) {
        cash.put(key, cash.get(key) + 1);
    }

    private static void subtractOne (Integer key) {
        cash.put(key, cash.get(key) - 1);
    }
}
