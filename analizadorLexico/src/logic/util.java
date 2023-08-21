/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author hamme
 */
public class util {

    private String text, wordCompleted;
    private boolean isToken = false;
    private int wordsAmount = 0;
    private char[] specialCharacters = {'+', '-', '*', '/', '%', '=', '!',
        '<', '>', '.', '#', '(', ')', '{', '}', '[', ']', ',', ';', ':', '_'};

    dictionaryTokens dicTok = new dictionaryTokens();

    public void setText(String textCharacterString) {
        this.text = textCharacterString;
    }

    public void readCharacter() {

        this.wordsAmount = 0;
        this.wordCompleted = null;

        ArrayList<word> word = new ArrayList<>();

        if (text != null) {
            for (int i = 0; i < text.length(); i++) {

                String individualCharacter = null;
                individualCharacter = Character.toString(text.charAt(i));

                if (Character.isLetterOrDigit(text.charAt(i))) {

                    if (wordCompleted != null) {
                        this.wordCompleted += individualCharacter;
                    } else {
                        this.wordCompleted = individualCharacter;
                    }

                } else if (Character.isSpace(text.charAt(i))) {
                    if (this.wordCompleted != null) {
                        wordsAmount++;
                        word.add(new word(wordCompleted));
                    }
                    this.wordCompleted = null;
                } else {

                    if (wordCompleted != null) {
                        //this.wordCompleted += individualCharacter;
                        this.wordCompleted += individualCharacter;
                    } else {
                        this.wordCompleted = individualCharacter;
                    }

                }
            }

            for (int i = 0; i <= wordsAmount + 1; i++) {
                System.out.println("El token " + i + " es:" + word.get(i));
            }
        }
    }

    public String getWord(int positionValue) {
        String content = " ";

        return content;
    }
}
