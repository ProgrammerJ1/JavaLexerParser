package JProjects.JavaLexerParser.Misc;

import java.util.LinkedList;
import java.util.List;

public class NaryTree {
    String val;
    List<NaryTree> children = new LinkedList<>();

    void TreeNode(String data){
        val = data;
    }

    void TreeNode(String data,List<NaryTree> child){
        val = data;
        children = child;
    }
}
