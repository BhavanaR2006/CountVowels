package com.example;

public class App {

public int countVowels(String text) {
    if (text == null) {
        throw new IllegalArgumentException("Text must not be null");
    }

    int count = 0;
    String str = text.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            count++;
        }
    }

    return count;
}

public static void main(String[] args) {
    App obj = new App();

    String text = "Hello World";

    System.out.println("String: " + text);
    System.out.println("Number of Vowels: "
            + obj.countVowels(text));
}

}