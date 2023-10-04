package n1exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateIDTest {

    @ParameterizedTest
    @CsvSource({"39397832,'M'", "45386578,'B'", "86488326,'T'", "37977656,'X'", "33831644,'R'", "29754655,'S'", "74243567,'G'", "88654456,'J'", "15895367,'K'", "64393877,'H'"})

    void calculateIDs(int number, char letter) {

        var calculate = new CalculateID();

       char letterMethod = calculate.calculateLetter(number);

        assertEquals(letter, letterMethod);
    }

}