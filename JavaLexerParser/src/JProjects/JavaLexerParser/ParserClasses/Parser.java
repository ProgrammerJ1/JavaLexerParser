package JProjects.JavaLexerParser.ParserClasses;
import java.util.*;
import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;
import JProjects.JavaLexerParser.LexerClasses.LexToken;
public class Parser {
    public HashSet<ParserGrammar> grammars;
    private AST output;
    public String rootValue;
    Parser(String x) {
        rootValue=x;
    }
    int Parse(ArrayList<LexToken> ParsedTokens) {
        JTree syntaxNaryTree=new JTree(new DefaultMutableTreeNode(rootValue));
        output=null;
        ArrayList<LexToken> tokens=ParsedTokens;
        boolean ParsingTokens=true;
        while(ParsingTokens) {
            boolean BadToken=true;
            ArrayList<LexToken> targetTokens;
            int targetTokensParsed;
            int grammarRule=0;
            ParseTokens:for (ParserGrammar i:grammars) {
                grammarRule++;
                ArrayList<Boolean> ArrayMatching=new ArrayList<Boolean>();
                targetTokensParsed=i.sentenceGrammar.SetenceGrammar.size();
                for (int j=0;j<i.sentenceGrammar.SetenceGrammar.size();j++) {
                    ArrayMatching.add(tokens.get(j).TokenName==i.sentenceGrammar.SetenceGrammar.get(j));
                } if (!ArrayMatching.contains(false)) {
                    BadToken=false;
                    break ParseTokens;
                }
            }
            if (BadToken) {
                return 4;
            } else {
                targetTokens=new ArrayList<LexToken>(Arrays.asList(Arrays.copyOfRange(ParsedTokens.toArray(), 0, targetTokensParsed)));
            }
        }
        return 0;
    }
}
