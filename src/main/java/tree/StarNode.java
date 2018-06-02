package tree;

public class StarNode extends Node {

    public StarNode(Node c1)
    {
        type = "STAR";

        leftChild = c1;

        c1.setParent(this);

        // Nullable:
        nullable = true;

        // First:
        first.addAll(c1.getFirst());

        // Last:
        last.addAll(c1.getLast());

        // Follow:
        for (Integer i: last)
        {
            Node n = symbolNodes.get(i);
            n.follow.addAll(first);
        }
        nodes.add(this);
    }
}
