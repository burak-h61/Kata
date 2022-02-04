public class RomanTenConverter implements IRomanNumerals{
    @Override
    public int convertRomanNumerals(String romanNumeral, int number) {
        if (romanNumeral.contains("X") ) {
            char[] romanChars = romanNumeral.toCharArray();
            for (int i = 0; i < romanChars.length; i++) {
                if (romanChars[i] == 'X') {
                    if (i != 0) {
                        number = 10 - number;
                    } else if(i ==0) {
                        number+=10;
                    }
                }
            }
        }
        return number;
    }
}
