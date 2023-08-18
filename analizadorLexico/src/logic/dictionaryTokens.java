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

    private HashMap operatorsHashMap = new HashMap();

    public void initDictionary() {
        operatorsHashMap.put("0", "+");
        operatorsHashMap.put("1", "-");
        operatorsHashMap.put("2", "**");
        operatorsHashMap.put("3", "/");
        operatorsHashMap.put("4", "//");
        operatorsHashMap.put("5", "%");
        operatorsHashMap.put("6", "*");
        operatorsHashMap.put("7", "==");
        operatorsHashMap.put("8", "!=");
        operatorsHashMap.put("9", ">");
        operatorsHashMap.put("10", ">");
        operatorsHashMap.put("11", ">=");
        operatorsHashMap.put("12", "<=");
        operatorsHashMap.put("13", "and");
        operatorsHashMap.put("14", "or");
        operatorsHashMap.put("15", "not");
        operatorsHashMap.put("16", "=");
        operatorsHashMap.put("17", "and");
        operatorsHashMap.put("18", "as");
        operatorsHashMap.put("19", "assert");
        operatorsHashMap.put("20", "break");
        operatorsHashMap.put("21", "class");
        operatorsHashMap.put("22", "continue");
        operatorsHashMap.put("23", "def");
        operatorsHashMap.put("24", "del");
        operatorsHashMap.put("25", "elif");
        operatorsHashMap.put("26", "else");
        operatorsHashMap.put("27", "except");
        operatorsHashMap.put("28", "False");
        operatorsHashMap.put("29", "finally");
        operatorsHashMap.put("30", "for");
        operatorsHashMap.put("31", "from");
        operatorsHashMap.put("32", "global");
        operatorsHashMap.put("33", "if");
        operatorsHashMap.put("34", "import");
        operatorsHashMap.put("35", "in");
        operatorsHashMap.put("36", "is");
        operatorsHashMap.put("37", "lambda");
        operatorsHashMap.put("38", "None");
        operatorsHashMap.put("39", "nonlocal");
        operatorsHashMap.put("40", "not");
        operatorsHashMap.put("41", "or");
        operatorsHashMap.put("42", "pass");
        operatorsHashMap.put("43", "raise");
        operatorsHashMap.put("44", "return");
        operatorsHashMap.put("45", "True");
        operatorsHashMap.put("46", "try");
        operatorsHashMap.put("47", "while");
        operatorsHashMap.put("48", "with");
        operatorsHashMap.put("49", "yield");
    }

    public String getOperatorsHashMap(String positionValue) {
        String content = operatorsHashMap.get(positionValue).toString();
        return content;
    }
}
