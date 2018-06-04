package regex_matching.tree;

public class PlusNode extends Node {

    public PlusNode(Node c1)
    {
        type = "PLUS";

        leftChild = c1;

        c1.setParent(this);

        // Nullable:
        nullable = leftChild.isNullable();

        // First:
        first.addAll(leftChild.getFirst());

        // Last:
        last.addAll(leftChild.getLast());

        // Follow:
        for (Integer i : leftChild.getLast()) {
            Node n = symbolNodes.get(i);
            n.follow.addAll(leftChild.getFirst());
        }
        nodes.add(this);
    }
}
