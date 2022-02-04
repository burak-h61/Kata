public class RomanFactory implements IRomanNumerals {
    private int number;
    private final String REGEX = "^[IVXL]+$";

    public RomanFactory(int number) {
        this.number = number;
    }

    public int convertRomanNumerals(String romanNumeral, int number) {
        IRomanNumerals romanNumerals;
        if (!(romanNumeral.isEmpty())&& romanNumeral.matches(REGEX)) {

            if (romanNumeral.contains("I")) {
                romanNumerals = new RomanOneConverter();
                this.number = romanNumerals.convertRomanNumerals(romanNumeral, number);
            }
            if (romanNumeral.contains("V")) {
                romanNumerals = new RomanFiveConverter();
                this.number = romanNumerals.convertRomanNumerals(romanNumeral, this.number);
            }
            if (romanNumeral.contains("X")) {
                romanNumerals = new RomanTenConverter();
                this.number = romanNumerals.convertRomanNumerals(romanNumeral, this.number);
            }
            if (romanNumeral.contains("L")) {
                romanNumerals = new RomanFiftyConverter();
                this.number = romanNumerals.convertRomanNumerals(romanNumeral, this.number);
            }
        }else{
            String message = "Invalid Input. Please check your Input";
            throw new IllegalArgumentException(message);
        }

        return this.number;
    }
}
