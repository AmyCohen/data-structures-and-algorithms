package day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiBracketValidationTest {

    @Test
    void validationLargeTrue() {
        String input = "[(code){fellows}]";
        Boolean actual = MultiBracketValidation.multiBracketValidation(input);
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void validationEmpty() {
        String input = "";
        Boolean actual = MultiBracketValidation.multiBracketValidation(input);
        Boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void validationWithBracketsAndText() {
        String input = "[(#code).{fellows!}]";
        Boolean actual = MultiBracketValidation.multiBracketValidation(input);
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void validationWithExtraParen() {
        String input = "[(code){fellows})]";
        Boolean actual = MultiBracketValidation.multiBracketValidation(input);
        Boolean expected = false;

        assertEquals(expected, actual);
    }
}