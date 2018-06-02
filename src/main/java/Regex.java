import das.DAS;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ScannerBuffer;
import tree.Node;

import java.io.*;

public class Regex {

    public static void main(String[] args) throws Exception {

        String regex = "(a|b)*abb";
        ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
        Reader reader = new BufferedReader(new StringReader(regex));
        Lexer lexer = new Lexer(reader, symbolFactory);
        ScannerBuffer buffer = new ScannerBuffer(lexer);
        parser parser = new parser(buffer, symbolFactory);
        parser.parse();


        Node root = parser.getRoot();
        System.out.println("\n>>> Regular Expression Tree   :");
        root.printTree();

        System.out.println("\n>>> Nullable, First, Last:");
        for (Node n: Node.getNodes() ) {
            n.printNode();
        }

        System.out.println("\n>>> Follow: ");
        for (Node s: Node.getSymbolNodes().values())
        {
            s.printFollow();
        }

        DAS automat = new DAS(root);
        System.out.println("\n>>> Trans table: ");
        automat.printTransTable();
    }
}
