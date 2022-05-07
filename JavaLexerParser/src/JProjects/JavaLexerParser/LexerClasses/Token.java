package JProjects.JavaLexerParser.LexerClasses;
import java.util.regex.Pattern;
public class Token {
    String Name;
    Pattern Regex;
    Token(String x,String y) {
        Name=x;
        Regex=Pattern.compile(y);
    }
}
