package regex_matching;

import regex_matching.das.DAS;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ScannerBuffer;
import regex_matching.tree.Node;
import org.apache.commons.lang3.ArrayUtils;
import java.io.*;

public class Regex {

    private String regularExpression;
    boolean verbose;

    private Reader reader;
    private Lexer lexer;
    private parser parser;
    private DAS automat;

    /*Creates regular expression: lexer, parser, DFA. Params: regular expression + verbose mode */
    public Regex(String regularExp, boolean verbose) throws Exception {

        this.regularExpression = regularExp;
        this.verbose = verbose;

        ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
        reader = new BufferedReader(new StringReader(regularExp));
        lexer = new Lexer(reader, symbolFactory);
        ScannerBuffer buffer = new ScannerBuffer(lexer);
        parser = new parser(buffer, symbolFactory);
        parser.parse();
        Node root = parser.getRoot();
        automat = new DAS(root);
        if(verbose == true)
        {
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
            System.out.println("\n>>> Trans table: ");
            automat.printTransTable();
        }
    }

    /* param: evalExp - string that will be matched to regular expression, returns true if string matches of false if not*/
    public boolean match(String evalExp) {
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

    public String getRegularExpression() {
        return regularExpression;
    }
}
