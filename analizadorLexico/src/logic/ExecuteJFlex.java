package logic;

import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.exceptions.SilentExit;

/**
 *
 * @author hamme
 */
public class ExecuteJFlex {

    public static void main(String entryPoint[]) {
        String lexerFile = System.getProperty("user.dir") + "/src/logic/Lexer.flex";
        String lexerColor = System.getProperty("user.dir") + "/src/logic/LexerColor.flex";

        try {
            jflex.Main.generate(new String[]{lexerFile, lexerColor});
        } catch (SilentExit ex) {
            Logger.getLogger(ExecuteJFlex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
