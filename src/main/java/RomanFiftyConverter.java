public class RomanFiftyConverter implements IRomanNumerals {

    @Override
    public int convertRomanNumerals(String romanNumeral, int number) {

        if (romanNumeral.contains("L") ) {
            char[] romanChars = romanNumeral.toCharArray();
            for (int i = 0; i < romanChars.length; i++) {
                if (romanChars[i] == 'L') {
                    if (i != 0) {
                        number = 50 - number;
                    } else if(i ==0) {
                        number+=50;
                    }
                }
            }
        }
        return number;
    }
}
