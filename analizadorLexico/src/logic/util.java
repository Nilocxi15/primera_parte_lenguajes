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
    private boolean tokenIsFilled = false;
    private int wordsAmount;
    private char[] specialCharacters = {'+', '-', '*', '/', '%', '=', '!',
        '<', '>', '.', '#', '(', ')', '{', '}', '[', ']', ',', ';', ':', '_'};

    dictionaryTokens dictionary = new dictionaryTokens();

    private ArrayList<token> token;
    private ArrayList<word> word;

    public void initArrayLists() {
        token = new ArrayList<>();
        word = new ArrayList<>();
    }

    public void setText(String textCharacterString) {
        this.text = textCharacterString;
    }

    public void readCharacter() {

        dictionary.initDictionary();
        dictionary.initClasificationDictionary();

        this.wordsAmount = 0;
        this.wordCompleted = null;

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

                        for (int j = 0; j <= 60; j++) {

                            if (wordCompleted.equals(dictionary.getToken(j))) {

                                if (tokenIsFilled == false) {
                                    token.add(new token(dictionary.getClasification(j)));
                                    isToken = true;
                                    tokenIsFilled = true;
                                }
                            }

                        }

                        if (isToken == false) {
                            try {
                                Double.parseDouble(wordCompleted);
                                token.add(new token("Constante"));
                                isToken = true;
                            } catch (NumberFormatException ex) {
                            }
                        }

                        if (isToken == false) {
                            token.add(new token("Identificador"));
                        }

                        this.isToken = false;
                        this.tokenIsFilled = false;
                    }
                    this.wordCompleted = null;
                } else {

                    if (wordCompleted != null) {
                        this.wordCompleted += individualCharacter;
                    } else {
                        this.wordCompleted = individualCharacter;
                    }

                }

                if (i == text.length() - 1) {
                    if (this.wordCompleted != null) {
                        wordsAmount++;
                        word.add(new word(wordCompleted));

                        for (int j = 0; j <= 60; j++) {

                            if (wordCompleted.equals(dictionary.getToken(j))) {

                                if (tokenIsFilled == false) {
                                    token.add(new token(dictionary.getClasification(j)));
                                    isToken = true;
                                    tokenIsFilled = true;
                                }
                            }

                        }

                        if (isToken == false) {
                            try {
                                Double.parseDouble(wordCompleted);
                                token.add(new token("Constante"));
                                isToken = true;
                            } catch (NumberFormatException ex) {
                            }
                        }

                        if (isToken == false) {
                            token.add(new token("Identificador"));
                        }

                        this.isToken = false;
                        this.tokenIsFilled = false;
                    }
                    this.wordCompleted = null;
                }
            }
        }
    }

    public String getWord(int positionValue) {
        String content = word.get(positionValue).toString();

        return content;
    }

    public String getToken(int positionValue) {
        String content = token.get(positionValue).toString();

        return content;
    }

    public int getWordsAmount() {
        return wordsAmount;
    }
}
