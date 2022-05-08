package JProjects.JavaLexerParser.Misc;
class NaryTree {
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
