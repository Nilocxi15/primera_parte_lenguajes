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
    //private boolean integerDitig;
    private int wordsAmount = 0;

    //dictionaryTokens dicTok = new dictionaryTokens();
    ArrayList<tokens> tokens = new ArrayList<>();
    ArrayList<word> word = new ArrayList<>();

    public void setText(String textCharacterString) {
        this.text = textCharacterString;
    }

    public void readCharacter() {
        if (text != null) {
            for (int i = 0; i < text.length(); i++) {

                String individualCharacter = null;
                individualCharacter = Character.toString(text.charAt(i));

                if (Character.isLetter(text.charAt(i))) {
                    tokens.add(new tokens(individualCharacter));
                    if (wordCompleted != null) {
                        this.wordCompleted += individualCharacter;
                    } else {
                        this.wordCompleted = individualCharacter;
                    }
                } else if (Character.isDigit(text.charAt(i))) {

                } else if (Character.isSpaceChar(text.charAt(i))) {
                    if (this.wordCompleted != null) {
                        wordsAmount++;
                        word.add(new word(wordCompleted));
                        System.out.println(wordCompleted);
                    }
                    this.wordCompleted = null;
                } else {
                    if (this.wordCompleted != null) {
                        wordsAmount++;
                        word.add(new word(wordCompleted));
                    }
                    this.wordCompleted = null;
                }
            }

            for (int i = 0; i <= wordsAmount; i++) {
                System.out.println("El token " + i + " es:" + word.get(i));
            }
            
            /* Esta onda ya funciona, ya guarda la concatenación de
            carácteres en tokens. Ahora tenés que comparar si existe el token
            que clase es, y verificar si es un número. Aún tenés que aplicar 
            la lógica para distinguir qué es qué, mientras, ya guarda los strings
            */
        }
    }

    public void wordsList(String wordString) {
        this.wordCompleted = wordString;
    }
}
