import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RomanFactoryTest {

    private RomanFactory romanFactory;
    private int expectedNumber;

    @BeforeEach
    void setUp() {
        this.romanFactory = new RomanFactory(0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testRomanNumeralsOne() {
        this.expectedNumber = 1;

        int actualNumber = this.romanFactory.convertRomanNumerals("I", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanThree() {
        this.expectedNumber = 3;

        int actualNumber = this.romanFactory.convertRomanNumerals("III", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanTwo() {
        this.expectedNumber = 2;

        int actualNumber = this.romanFactory.convertRomanNumerals("II", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanFour() {
        this.expectedNumber = 4;

        int actualNumber = this.romanFactory.convertRomanNumerals("IV", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanFive() {
        this.expectedNumber = 5;

        int actualNumber = this.romanFactory.convertRomanNumerals("V", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }


    @Test
    void testRomanSix() {
        this.expectedNumber = 6;

        int actualNumber = this.romanFactory.convertRomanNumerals("VI", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanTenX() {
        this.expectedNumber = 10;

        int actualNumber = this.romanFactory.convertRomanNumerals("X", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanEleven() {
        this.expectedNumber = 11;

        int actualNumber = this.romanFactory.convertRomanNumerals("XI", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanNine() {
        this.expectedNumber = 9;

        int actualNumber = this.romanFactory.convertRomanNumerals("IX", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanEight() {
        this.expectedNumber = 8;

        int actualNumber = this.romanFactory.convertRomanNumerals("IIX", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanSeven() {
        this.expectedNumber = 7;

        int actualNumber = this.romanFactory.convertRomanNumerals("VII", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanFifty() {
        this.expectedNumber = 50;

        int actualNumber = this.romanFactory.convertRomanNumerals("L", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testRomanFortyFive() {
        this.expectedNumber = 45;

        int actualNumber = this.romanFactory.convertRomanNumerals("VL", 0);

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void testInvalidRomanNumerals() {
        String message = "Invalid Input. Please check your Input";

        assertThatThrownBy(() -> this.romanFactory.convertRomanNumerals(" ", 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(message);
    }
}