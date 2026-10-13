package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

@Test
public void testCountVowels() {
    App obj = new App();
    assertEquals(3, obj.countVowels("Hello World"));
}

@Test
public void testUppercaseVowels() {
    App obj = new App();
    assertEquals(5, obj.countVowels("AEIOU"));
}

@Test
public void testNoVowels() {
    App obj = new App();
    assertEquals(0, obj.countVowels("xyz"));
}

}