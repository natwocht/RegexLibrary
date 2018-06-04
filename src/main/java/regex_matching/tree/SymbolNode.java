package regex_matching.tree;

import java.util.HashSet;

public class SymbolNode extends Node {

    Integer id;         // symbol identifier

    public static Integer counter = 0;

    public SymbolNode(Character c1)
    {
        type = "CHAR";

        counter++;
        id = counter;
        literal = c1;

        leftChild = null;
        rightChild = null;

        // Nullable:
        nullable = false;

        // First:
        first.add(id);

        // Last:
        last.add(id);

        // Follow:
        follow = new HashSet<Integer>();

        // Add symbol to symbols set
        symbolNodes.put(id, this);
        inputSymbols.put(id, c1);
        nodes.add(this);
    }


}
