package JProjects.JavaLexerParser.Misc;

import java.util.LinkedList;

public class NaryTree {
    Object value;
    LinkedList<NaryTree> children;
    NaryTree(Object data) {
        value=data;
    }
}
