package JProjects.JavaLexerParser.ParserClasses;
import JProjects.JavaLexerParser.Misc.NaryTree;

import java.util.ArrayList;
import JProjects.JavaLexerParser.Misc.*;
import JProjects.JavaLexerParser.LexerClasses.LexToken;
public class Parser {
    public ArrayList<ParserGrammar> grammars;
    private AST output;
    public String rootValue;
    Parser(String x) {
        rootValue=x;
    }
    int Parse(ArrayList<LexToken> ParsedTokens) {
        NaryTree syntaxTreeData=new NaryTree("statement sequence");
        output=null;
        ArrayList<LexToken> tokens=ParsedTokens;
        boolean ParsingTokens=true;
        while(ParsingTokens) {
            boolean BadToken=true;
            ArrayList<LexToken> targetTokens;
            ParseTokens:for (ParserGrammar i:grammars) {
                ArrayList<Boolean> ArrayMatching=new ArrayList<Boolean>();
                for (int j=0;j<i.sentenceGrammar.SetenceGrammar.size();j++) {
                    ArrayMatching.add(tokens.get(j).TokenName==i.sentenceGrammar.SetenceGrammar.get(j));
                } if (!ArrayMatching.contains(false)) {
                    BadToken=false;
                    break ParseTokens;
                }
            }
            if (!BadToken) {
                return 5;
            }
        }
        return 0;
    }
}
