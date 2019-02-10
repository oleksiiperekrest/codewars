package binaryArrayToNumber;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : binary) {
            stringBuilder.append(i);
        }
        return Integer.parseInt(stringBuilder.toString(), 2);
    }

}
