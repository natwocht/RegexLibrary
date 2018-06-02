package tree;

public class Epsilon extends Node{

    public Epsilon()
    {
        type = "EPSILON";
        leftChild = null;
        rightChild = null;
        // Nullable:
        nullable = true;
        // First:
        first = null;
        // Last:
        last = null;

        nodes.add(this);
    }
}
