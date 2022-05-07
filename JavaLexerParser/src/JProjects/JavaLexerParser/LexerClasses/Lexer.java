package JProjects.JavaLexerParser.LexerClasses;
import java.util.Arrays;
import java.util.*;
import java.util.regex.*;
public class Lexer {
    private HashMap<String,Pattern> tokensTypeHashMap=new HashMap<String,Pattern>();
    private LexToken[] TokenizedOutput;
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
}
