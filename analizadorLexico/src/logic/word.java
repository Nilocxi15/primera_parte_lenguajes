/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author hamme
 */
public class word {

    private String wordString;

    public word(String concatenatedWord) {
        this.wordString = concatenatedWord;
    }

    @Override
    public String toString() {
        return wordString;
    }

}
