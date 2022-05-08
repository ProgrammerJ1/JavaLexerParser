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
        tokensTypeHashMap.put(x,Regex);
        return 0;
    }
    public int RemoveTokenType(String x) {
        if (!tokensTypeHashMap.containsKey(x)) {
            return 2;
        } else {
            tokensTypeHashMap.remove(x);
            return 0;
        }
    }
    public int Lex(String string) {
        TokenizedOutput.clear();
        String currentString=string;
        boolean LexingString=true;
        while (LexingString) {
            boolean AnyMatch=false;
            LexAttempt: for (String i:tokensTypeHashMap.keySet()) {
                if (tokensTypeHashMap.get(i).matcher(currentString).matches()) {
                    AnyMatch=true;
                    String match=tokensTypeHashMap.get(i).matcher(currentString).group(1);
                    String tokenType=i;
                    TokenizedOutput.add(new LexToken(match,tokenType));
                    currentString=currentString.substring(currentString.indexOf(match, 0));
                    break LexAttempt;
                }
            }
            if (!AnyMatch) {
                TokenizedOutput.clear();
                return 3;
            } else {
                LexingString=currentString.length()!=0;
            }
        }
        return 0;
    }
    public ArrayList<LexToken> getTokenizedOutput() {
        return TokenizedOutput;
    }
}
