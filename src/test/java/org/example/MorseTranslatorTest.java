package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseTranslatorTest {

    // Positive tests only for now
    @Test
    public void translateToMorse_GivenA_ReturnsValidMorse() {
        // Arrange
        MorseTranslator translator = new MorseTranslator();
        // Act
        String result = translator.translateToMorse("A");
        // Assert
        assertEquals(".-", result);
    }

    @Test
    public void translateToMorse_GivenS_ReturnsValidMorse() {
        // Arrange
        MorseTranslator translator = new MorseTranslator();
        // Act
        String result = translator.translateToMorse("S");
        // Assert
        assertEquals("...", result);
    }

    @Test
    public void translateToMorse_GivenAndy_ReturnsValidMorse() {
        // Arrange
        MorseTranslator translator = new MorseTranslator();
        // Act
        String result = translator.translateToMorse("Andy");
        // Assert
        assertEquals(".--.-..-.--", result);
    }

    @Test
    public void translateToMorse_GivenHelloWorld_ReturnsValidMorse() {
        // Arrange
        MorseTranslator translator = new MorseTranslator();
        // Act
        String result = translator.translateToMorse("HelloWorld");
        // Assert
        assertEquals("......-...-..---.-----.-..-..-..", result);
    }

    // Negative tests later (Although we haven't done exceptions yet)

}
