import das.DAS;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ScannerBuffer;
import tree.Node;
import org.apache.commons.lang3.ArrayUtils;
import java.io.*;

public class Regex {

    public static void main(String[] args) throws Exception {

        String regex = "c?([a-f]|b)*abb";
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

        if (match("cdabb", automat))
            System.out.println("Expression matches given regular expression");
        else
            System.out.println("Expression doesn't match given regular expression");

    }

    static public boolean match(String evalExp, DAS automat) {
        Character[] evalExpr = ArrayUtils.toObject(evalExp.toCharArray());

        for (Character c : evalExpr) {
            if (!automat.takeCharacter(c)) {
                automat.resetAutomaton();
                return false;
            }
        }
        boolean result = automat.reachTheEnd();
        automat.resetAutomaton();
        return result;
    }
}
