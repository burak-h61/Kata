public class RomanOneConverter implements IRomanNumerals {

    @Override
    public int convertRomanNumerals(String romanNumeral,int number) {
        if (romanNumeral.contains("I") && number ==0) {
            char[] romanChars = romanNumeral.toCharArray();
            for (int i = 0; i < romanChars.length; i++) {
                if (romanChars[i] == 'I') {
                    number++;
                }
            }
        }
        return number;
    }
}
