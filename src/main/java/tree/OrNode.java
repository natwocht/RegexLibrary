package tree;

public class OrNode extends Node {

    public OrNode(Node c1, Node c2)
    {
        type = "OR";

        leftChild = c1;
        rightChild = c2;
        leftChild.setParent(this);
        rightChild.setParent(this);

        // Nullable:
        nullable = leftChild.isNullable() || rightChild.isNullable();

        // First:
        first.addAll(leftChild.getFirst());
        first.addAll(rightChild.getFirst());

        // Last:
        last.addAll(leftChild.getLast());
        last.addAll(rightChild.getLast());
        nodes.add(this);
    }

    public OrNode(Character c1, Character c2)
    {
        type = "OR";

        if (c1 != c2 - 1)
            leftChild = new OrNode(c1, (char) (c2 - 1));
        else
            leftChild = new SymbolNode(c1);
        rightChild = new SymbolNode(c2);

        leftChild.setParent(this);
        rightChild.setParent(this);

        // Nullable:
        nullable = leftChild.isNullable() || rightChild.isNullable();

        // First:
        first.addAll(leftChild.getFirst());
        first.addAll(rightChild.getFirst());

        // Last:
        last.addAll(leftChild.getLast());
        last.addAll(rightChild.getLast());
        nodes.add(this);
    }

    public OrNode(Node c1)
    {
        type = "OR";

        leftChild = c1;
        rightChild = new Epsilon();
        leftChild.setParent(this);
        rightChild.setParent(this);

        // Nullable:
        nullable = leftChild.isNullable() || rightChild.isNullable();

        // First:
        first.addAll(leftChild.getFirst());

        // Last:
        last.addAll(leftChild.getLast());

        nodes.add(this);
    }

}
