package com.lesson33;

import java.util.LinkedHashSet;
import java.util.Set;

public class Coder {
private static final int ALPHABET_POWER = 26;
private static final int FIRST_LETTER_ASCII = 65;
private static final int LAST_LETTER_ASCII = 90;

private final Set<Character> dic = new LinkedHashSet<>();

    public Coder() {
        for (int i = FIRST_LETTER_ASCII; i <= LAST_LETTER_ASCII; i++) {
            dic.add((char) i);
        }
    }

    public void encrypt(String srcText, int key) {
        srcText = srcText.toUpperCase();
        char ch;
        if ((key <= ALPHABET_POWER) && (key >= 1)) {
            for (int i = 0; i < srcText.length(); i++) {
                ch = srcText.charAt(i);
                if (dic.contains(ch)) {
                    System.out.print((char) ((ch + key - FIRST_LETTER_ASCII) % ALPHABET_POWER + FIRST_LETTER_ASCII));
                } else System.out.print(ch);
            }
        }
    }

    public void decrypt(String srcText, int key) {
        srcText = srcText.toUpperCase();
        char ch;
        if ((key <= ALPHABET_POWER) && (key >= 1)) {
            for (int i = 0; i < srcText.length(); i++) {
                ch = srcText.charAt(i);
                if (dic.contains(ch)) {
                    System.out.print((char) ((ch - key + FIRST_LETTER_ASCII) % ALPHABET_POWER + FIRST_LETTER_ASCII));
                } else System.out.print(ch);
            }
        }
    }

}

