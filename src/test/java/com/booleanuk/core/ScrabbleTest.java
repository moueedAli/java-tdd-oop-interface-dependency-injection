package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Alphabet a = new GreekAlph();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Alphabet a = new GreekAlph();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Alphabet a = new EnglishAlph();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Alphabet a = new EnglishAlph();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Alphabet a = new EnglishAlph();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Alphabet a = new EnglishAlph();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(22, scrabble.score("quirky"));
    }

    @Test
    public void shouldScoreRussianLetters() {
        Alphabet a = new RussianAlph();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(18, scrabble.score("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        Alphabet a = new GreekAlph();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(20, scrabble.score("φεψωλ"));
    }
}
