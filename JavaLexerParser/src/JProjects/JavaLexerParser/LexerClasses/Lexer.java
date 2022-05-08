package JProjects.JavaLexerParser.LexerClasses;
import java.util.*;
import java.util.regex.*;
public class Lexer {
    private HashMap<String,Pattern> tokensTypeHashMap=new HashMap<String,Pattern>();
    private ArrayList<LexToken> TokenizedOutput;
    public int AddTokenType(String x,String y) {
        Pattern Regex;
        try {
           Regex=Pattern.compile(y); 
        } catch (PatternSyntaxException e) {
            return 1;
        }
        tokensTypeHashMap.put(x, Regex);
        return 0;
    }
    public int RemoveTokenType(String x) {
        if (!tokensTypeHashMap.containsKey(x)) {
            return 2;
        } else {
            tokensTypeHashMap.remove(x);
            return 1;
        }
    }
    public int Lex(String string) {
        return 0;
    }
}
