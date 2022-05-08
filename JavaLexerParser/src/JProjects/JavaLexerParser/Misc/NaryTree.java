package JProjects.JavaLexerParser.Misc;

import java.util.LinkedList;
import java.util.List;

public class NaryTree {
    Object value;
    LinkedList<NaryTree> children;
    NaryTree(Object data) {
        value=data;
    }
}
