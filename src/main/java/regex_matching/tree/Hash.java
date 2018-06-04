package regex_matching.tree;

import java.util.HashSet;
import java.util.Set;

public class Hash extends Node {

    Integer id;
    Set<Integer> follow; // follow set
    Character value;

    public Hash()
    {
        type = "HASH";

        SymbolNode.counter++;
        id = SymbolNode.counter;

        nullable = false;

        first.add(id);
        last.add(id);

        follow = new HashSet<Integer>();

        nodes.add(this);
        symbolNodes.put(id, this);
        inputSymbols.put(id, value);

    }
}
