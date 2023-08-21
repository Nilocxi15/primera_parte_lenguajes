/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.HashMap;

/**
 *
 * @author hamme
 */
public class dictionaryTokens {

    private final HashMap tokensHashMap = new HashMap();
    private final HashMap clasificationHashMap = new HashMap();
    private final HashMap patternHashMap = new HashMap();

    public void initDictionary() {
        tokensHashMap.put("0", "+");
        tokensHashMap.put("1", "-");
        tokensHashMap.put("2", "**");
        tokensHashMap.put("3", "/");
        tokensHashMap.put("4", "//");
        tokensHashMap.put("5", "%");
        tokensHashMap.put("6", "*");
        tokensHashMap.put("7", "==");
        tokensHashMap.put("8", "!=");
        tokensHashMap.put("9", ">");
        tokensHashMap.put("10", ">");
        tokensHashMap.put("11", ">=");
        tokensHashMap.put("12", "<=");
        tokensHashMap.put("13", "and");
        tokensHashMap.put("14", "or");
        tokensHashMap.put("15", "not");
        tokensHashMap.put("16", "=");
        tokensHashMap.put("17", "and");
        tokensHashMap.put("18", "as");
        tokensHashMap.put("19", "assert");
        tokensHashMap.put("20", "break");
        tokensHashMap.put("21", "class");
        tokensHashMap.put("22", "continue");
        tokensHashMap.put("23", "def");
        tokensHashMap.put("24", "del");
        tokensHashMap.put("25", "elif");
        tokensHashMap.put("26", "else");
        tokensHashMap.put("27", "except");
        tokensHashMap.put("28", "False");
        tokensHashMap.put("29", "finally");
        tokensHashMap.put("30", "for");
        tokensHashMap.put("31", "from");
        tokensHashMap.put("32", "global");
        tokensHashMap.put("33", "if");
        tokensHashMap.put("34", "import");
        tokensHashMap.put("35", "in");
        tokensHashMap.put("36", "is");
        tokensHashMap.put("37", "lambda");
        tokensHashMap.put("38", "None");
        tokensHashMap.put("39", "nonlocal");
        tokensHashMap.put("40", "not");
        tokensHashMap.put("41", "or");
        tokensHashMap.put("42", "pass");
        tokensHashMap.put("43", "raise");
        tokensHashMap.put("44", "return");
        tokensHashMap.put("45", "True");
        tokensHashMap.put("46", "try");
        tokensHashMap.put("47", "while");
        tokensHashMap.put("48", "with");
        tokensHashMap.put("49", "yield");
        tokensHashMap.put("50", "True");
        tokensHashMap.put("51", "False");
    }

    public void initClasificationDictionary() {
        clasificationHashMap.put("0", "Aritmetico");
        clasificationHashMap.put("1", "Aritmetico");
        clasificationHashMap.put("2", "Aritmetico");
        clasificationHashMap.put("3", "Aritmetico");
        clasificationHashMap.put("4", "Aritmetico");
        clasificationHashMap.put("5", "Aritmetico");
        clasificationHashMap.put("6", "Aritmetico");
        clasificationHashMap.put("7", "Comparacion");
        clasificationHashMap.put("8", "Comparacion");
        clasificationHashMap.put("9", "Comparacion");
        clasificationHashMap.put("10", "Comparacion");
        clasificationHashMap.put("11", "Comparacion");
        clasificationHashMap.put("12", "Comparacion");
        clasificationHashMap.put("13", "Logicos");
        clasificationHashMap.put("14", "Logicos");
        clasificationHashMap.put("15", "Logicos");
        clasificationHashMap.put("16", "Asignacion");
        clasificationHashMap.put("17", "Palabras Clave");
        clasificationHashMap.put("18", "Palabras Clave");
        clasificationHashMap.put("19", "Palabras Clave");
        clasificationHashMap.put("20", "Palabras Clave");
        clasificationHashMap.put("21", "Palabras Clave");
        clasificationHashMap.put("22", "Palabras Clave");
        clasificationHashMap.put("23", "Palabras Clave");
        clasificationHashMap.put("24", "Palabras Clave");
        clasificationHashMap.put("25", "Palabras Clave");
        clasificationHashMap.put("26", "Palabras Clave");
        clasificationHashMap.put("27", "Palabras Clave");
        clasificationHashMap.put("28", "Palabras Clave");
        clasificationHashMap.put("29", "Palabras Clave");
        clasificationHashMap.put("30", "Palabras Clave");
        clasificationHashMap.put("31", "Palabras Clave");
        clasificationHashMap.put("32", "Palabras Clave");
        clasificationHashMap.put("33", "Palabras Clave");
        clasificationHashMap.put("34", "Palabras Clave");
        clasificationHashMap.put("35", "Palabras Clave");
        clasificationHashMap.put("36", "Palabras Clave");
        clasificationHashMap.put("37", "Palabras Clave");
        clasificationHashMap.put("38", "Palabras Clave");
        clasificationHashMap.put("39", "Palabras Clave");
        clasificationHashMap.put("40", "Palabras Clave");
        clasificationHashMap.put("41", "Palabras Clave");
        clasificationHashMap.put("42", "Palabras Clave");
        clasificationHashMap.put("43", "Palabras Clave");
        clasificationHashMap.put("44", "Palabras Clave");
        clasificationHashMap.put("45", "Palabras Clave");
        clasificationHashMap.put("46", "Palabras Clave");
        clasificationHashMap.put("47", "Palabras Clave");
        clasificationHashMap.put("48", "Palabras Clave");
        clasificationHashMap.put("49", "Palabras Clave");
        clasificationHashMap.put("50", "Constantes");
        clasificationHashMap.put("51", "Constantes");
    }

    public void initPatternTokens() {
        patternHashMap.put("0", "+");
        patternHashMap.put("1", "-");
        patternHashMap.put("2", "**");
        patternHashMap.put("3", "/");
        patternHashMap.put("4", "//");
        patternHashMap.put("5", "%");
        patternHashMap.put("6", "*");
        patternHashMap.put("7", "==");
        patternHashMap.put("8", "!=");
        patternHashMap.put("9", ">");
        patternHashMap.put("10", ">");
        patternHashMap.put("11", ">=");
        patternHashMap.put("12", "<=");
        patternHashMap.put("13", "and");
        patternHashMap.put("14", "or");
        patternHashMap.put("15", "not");
        patternHashMap.put("16", "=");
        patternHashMap.put("17", "and");
        patternHashMap.put("18", "as");
        patternHashMap.put("19", "assert");
        patternHashMap.put("20", "break");
        patternHashMap.put("21", "class");
        patternHashMap.put("22", "continue");
        patternHashMap.put("23", "def");
        patternHashMap.put("24", "del");
        patternHashMap.put("25", "elif");
        patternHashMap.put("26", "else");
        patternHashMap.put("27", "except");
        patternHashMap.put("28", "False");
        patternHashMap.put("29", "finally");
        patternHashMap.put("30", "for");
        patternHashMap.put("31", "from");
        patternHashMap.put("32", "global");
        patternHashMap.put("33", "if");
        patternHashMap.put("34", "import");
        patternHashMap.put("35", "in");
        patternHashMap.put("36", "is");
        patternHashMap.put("37", "lambda");
        patternHashMap.put("38", "None");
        patternHashMap.put("39", "nonlocal");
        patternHashMap.put("40", "not");
        patternHashMap.put("41", "or");
        patternHashMap.put("42", "pass");
        patternHashMap.put("43", "raise");
        patternHashMap.put("44", "return");
        patternHashMap.put("45", "True");
        patternHashMap.put("46", "try");
        patternHashMap.put("47", "while");
        patternHashMap.put("48", "with");
        patternHashMap.put("49", "yield");
        patternHashMap.put("50", "True");
        patternHashMap.put("51", "False");
    }

    public String getInitDictionary(String positionValue) {
        String content = tokensHashMap.get(positionValue).toString();
        return content;
    }

    public String getInitClasificationDictionary(String positionValue) {
        String content = clasificationHashMap.get(positionValue).toString();
        return content;
    }

    public String getInitPatternTokens(String positionValue) {
        String content = patternHashMap.get(positionValue).toString();
        return content;
    }

}
