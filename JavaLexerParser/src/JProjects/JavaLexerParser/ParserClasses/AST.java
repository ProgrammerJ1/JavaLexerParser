package JProjects.JavaLexerParser.ParserClasses;
import java.util.List;
import java.util.LinkedList;
public class AST {
    private class NaryTree {
        Object val;
        List<NaryTree> children = new LinkedList<>();
    
        void TreeNode(Object data){
            val = data;
        }
    
        void TreeNode(Object data,List<NaryTree> child){
            val = data;
            children = child;
        }
    }
    NaryTree tree;
    AST(NaryTree x) {
        tree=x;
    }
}
