public class RomanFiveConverter implements IRomanNumerals {

    @Override
    public int convertRomanNumerals(String romanNumeral, int number) {
        if (romanNumeral.contains("V")) {
            char[] romanChars = romanNumeral.toCharArray();
            for (int i = 0; i < romanChars.length; i++) {
                if (romanChars[i] == 'V') {
                    if (i != 0) {
                        number = 5 - number;
                    } else if(i ==0) {
                         number+=5;
                    }
                }
            }
        }
        return number;
    }
}
