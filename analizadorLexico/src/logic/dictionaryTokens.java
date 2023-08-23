/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author hamme
 */
public class dictionaryTokens {
    
    private final String tokenMatrix [] = new String[61];
    private final String[] clasificationMatrix = new String[61];

    public void initDictionary() {
        tokenMatrix[0] = "+";
        tokenMatrix[1] = "-";
        tokenMatrix[2] = "**";
        tokenMatrix[3] = "/";
        tokenMatrix[4] = "//";
        tokenMatrix[5] = "%";
        tokenMatrix[6] = "*";
        tokenMatrix[7] = "==";
        tokenMatrix[8] = "!=";
        tokenMatrix[9] = ">";
        tokenMatrix[10] = "<";
        tokenMatrix[11] = ">=";
        tokenMatrix[12] = "<=";
        tokenMatrix[13] = "and";
        tokenMatrix[14] = "or";
        tokenMatrix[15] = "not";
        tokenMatrix[16] = "=";
        tokenMatrix[17] = "and";
        tokenMatrix[18] = "as";
        tokenMatrix[19] = "assert";
        tokenMatrix[20] = "break";
        tokenMatrix[21] = "class";
        tokenMatrix[22] = "continue";
        tokenMatrix[23] = "def";
        tokenMatrix[24] = "del";
        tokenMatrix[25] = "elif";
        tokenMatrix[26] = "else";
        tokenMatrix[27] = "except";
        tokenMatrix[28] = "False";
        tokenMatrix[29] = "finally";
        tokenMatrix[30] = "for";
        tokenMatrix[31] = "from";
        tokenMatrix[32] = "global";
        tokenMatrix[33] = "if";
        tokenMatrix[34] = "import";
        tokenMatrix[35] = "in";
        tokenMatrix[36] = "is";
        tokenMatrix[37] = "lambda";
        tokenMatrix[38] = "None";
        tokenMatrix[39] = "nonlocal";
        tokenMatrix[40] = "not";
        tokenMatrix[41] = "or";
        tokenMatrix[42] = "pass";
        tokenMatrix[43] = "raise";
        tokenMatrix[44] = "return";
        tokenMatrix[45] = "True";
        tokenMatrix[46] = "try";
        tokenMatrix[47] = "while";
        tokenMatrix[48] = "with";
        tokenMatrix[49] = "yield";
        tokenMatrix[50] = "True";
        tokenMatrix[51] = "False";
        tokenMatrix[52] = "(";
        tokenMatrix[53] = ")";
        tokenMatrix[54] = "{";
        tokenMatrix[55] = "}";
        tokenMatrix[56] = "[";
        tokenMatrix[57] = "]";
        tokenMatrix[58] = ",";
        tokenMatrix[59] = ";";
        tokenMatrix[60] = ":";
    }

    public void initClasificationDictionary() {
        clasificationMatrix[0] = "Aritmetico";
        clasificationMatrix[1] = "Aritmetico";
        clasificationMatrix[2] = "Aritmetico";
        clasificationMatrix[3] = "Aritmetico";
        clasificationMatrix[4] = "Aritmetico";
        clasificationMatrix[5] = "Aritmetico";
        clasificationMatrix[6] = "Aritmetico";
        clasificationMatrix[7] = "Comparacion";
        clasificationMatrix[8] = "Comparacion";
        clasificationMatrix[9] = "Comparacion";
        clasificationMatrix[10] = "Comparacion";
        clasificationMatrix[11] = "Comparacion";
        clasificationMatrix[12] = "Comparacion";
        clasificationMatrix[13] = "Logicos";
        clasificationMatrix[14] = "Logicos";
        clasificationMatrix[15] = "Logicos";
        clasificationMatrix[16] = "Asignacion";
        clasificationMatrix[17] = "Palabras Clave";
        clasificationMatrix[18] = "Palabras Clave";
        clasificationMatrix[19] = "Palabras Clave";
        clasificationMatrix[20] = "Palabras Clave";
        clasificationMatrix[21] = "Palabras Clave";
        clasificationMatrix[22] = "Palabras Clave";
        clasificationMatrix[23] = "Palabras Clave";
        clasificationMatrix[24] = "Palabras Clave";
        clasificationMatrix[25] = "Palabras Clave";
        clasificationMatrix[26] = "Palabras Clave";
        clasificationMatrix[27] = "Palabras Clave";
        clasificationMatrix[28] = "Palabras Clave";
        clasificationMatrix[29] = "Palabras Clave";
        clasificationMatrix[30] = "Palabras Clave";
        clasificationMatrix[31] = "Palabras Clave";
        clasificationMatrix[32] = "Palabras Clave";
        clasificationMatrix[33] = "Palabras Clave";
        clasificationMatrix[34] = "Palabras Clave";
        clasificationMatrix[35] = "Palabras Clave";
        clasificationMatrix[36] = "Palabras Clave";
        clasificationMatrix[37] = "Palabras Clave";
        clasificationMatrix[38] = "Palabras Clave";
        clasificationMatrix[39] = "Palabras Clave";
        clasificationMatrix[40] = "Palabras Clave";
        clasificationMatrix[41] = "Palabras Clave";
        clasificationMatrix[42] = "Palabras Clave";
        clasificationMatrix[43] = "Palabras Clave";
        clasificationMatrix[44] = "Palabras Clave";
        clasificationMatrix[45] = "Palabras Clave";
        clasificationMatrix[46] = "Palabras Clave";
        clasificationMatrix[47] = "Palabras Clave";
        clasificationMatrix[48] = "Palabras Clave";
        clasificationMatrix[49] = "Palabras Clave";
        clasificationMatrix[50] = "Constantes";
        clasificationMatrix[51] = "Constantes";
        clasificationMatrix[52] = "Otros";
        clasificationMatrix[53] = "Otros";
        clasificationMatrix[54] = "Otros";
        clasificationMatrix[55] = "Otros";
        clasificationMatrix[56] = "Otros";
        clasificationMatrix[57] = "Otros";
        clasificationMatrix[58] = "Otros";
        clasificationMatrix[59] = "Otros";
        clasificationMatrix[60] = "Otros";
    }

    public String getClasification(int positionValue) {
        return clasificationMatrix[positionValue];
    }

    public String getToken (int positionValue) {
        return tokenMatrix[positionValue];
    }
    

}
