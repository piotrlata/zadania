package arabictoroman;

import java.util.List;

public class ArabicToRoman {
    public static void main(String[] args) {
        System.out.println(arabicToRoman(1));
    }

    public static String arabicToRoman(int number) {
        if (number > 4000 || number < 1) {
            throw new IllegalArgumentException("number must be in range 1-4000");
        }
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (number > 0 && i < romanNumerals.size()) {
            RomanNumeral currentNumeral = romanNumerals.get(i);
            if (currentNumeral.getValue() <= number) {
                sb.append(currentNumeral.name());
                number -= currentNumeral.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
