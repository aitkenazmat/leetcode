package algorithms.string;

import java.util.List;

class Node {
    public int val;
    public java.util.List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
