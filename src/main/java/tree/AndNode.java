package tree;

public class AndNode extends Node{

    public AndNode(Node c1, Node c2)
    {
        type = "AND";
        leftChild = c1;
        rightChild = c2;
        c1.setParent(this);
        c2.setParent(this);

        //Nullable:
        nullable = leftChild.isNullable() && rightChild.isNullable();

        // First:
        if(c1.isNullable())
        {
            first.addAll(c1.getFirst());
            first.addAll(c2.getFirst());
        }
        else
        {
            first.addAll(c1.getFirst());
        }

        // Last:
        if(c2.isNullable())
        {
            last.addAll(c2.getLast());
            last.addAll(c1.getLast());
        }
        else
        {
            last.addAll(c2.getLast());
        }

        // Follow:
        for (Integer id: leftChild.getLast()){
            Node n = symbolNodes.get(id);
            n.follow.addAll(rightChild.getFirst());
        }

        nodes.add(this);
    }
}
