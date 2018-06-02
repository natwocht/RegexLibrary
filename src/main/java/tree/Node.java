package tree;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Node {

    String type; // node type

    Node parent; // parent node
    Node leftChild; // left child
    Node rightChild; // right child

    boolean nullable; // specifies whether node is nullable

    Set<Integer> first; // first set
    Set<Integer> last; // last set
    Set<Integer> follow; // follow set

    char literal;

    static Map<Integer, Node> symbolNodes = new HashMap<Integer, Node>();

    static Map<Integer, Character> inputSymbols = new HashMap<Integer, Character>();

    static Set<Node> nodes = new HashSet<Node>();

    Node()
    {
        first = new HashSet<Integer>();
        last = new HashSet<Integer>();
    }

    public void printNode()
    {
        System.out.println("Type:\t" + type + " Nullable:\t" + nullable + "  First: " + first + "  Last: " + last );
    }

    public void setParent(Node parent)
    {
        this.parent = parent;
    }

    public Boolean isNullable()
    {
        return this.nullable;
    }

    public Set<Integer> getFirst() {
        return first;
    }

    public Set<Integer> getLast() {
        return last;
    }

    public void printTree() throws IOException {
        if (rightChild != null) {
            rightChild.printTree( true, "");
        }
        printNodeValue();
        if (leftChild != null) {
            leftChild.printTree(false, "");
        }
    }
    private void printNodeValue() throws IOException {
        if (type == null) {
            System.out.print("<null>");
        }
        else if(type == "CHAR")
        {
            System.out.println(type + ": " + literal );
        }
        else if(type == "HASH")
        {
            System.out.println("#");
        }
        else {
            System.out.print(type);
        }
        System.out.print('\n');
    }

    private void printTree(boolean isRight, String indent) throws IOException {
        if (rightChild != null) {
            rightChild.printTree(true, indent + (isRight ? "        " : " |      "));
        }
        System.out.print(indent);
        if (isRight) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.print("----- ");
        printNodeValue();
        if (leftChild != null) {
            leftChild.printTree(false, indent + (isRight ? " |      " : "        "));
        }
    }

    public static Set<Node> getNodes() {
        return nodes;
    }

    public static Map<Integer, Node> getSymbolNodes() {
        return symbolNodes;
    }

    public static Map<Integer, Character> getInputSymbols() {
        return inputSymbols;
    }
    public Set<Integer> getFollow() {
        return follow;
    }
    public void printFollow()
    {
        System.out.println("CHAR: " + literal + " Follow: " +follow);
    }
}
