package das;
import tree.Node;

import java.util.*;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class DAS {

    State currentState;
    static char counter = 'A'; // name of state
    private Map <Integer, Character> inputSymbols; // input symbols: id + char value
    private Map <Integer, Node> inputSymbolNodes; // input symbols: id + tree.Node
    private Multimap <Character, Integer> characterPosition; // defines in which positions the given character , each key may be associated with multiple values
    private Map<State, Set<Integer>> existingStates = new HashMap<State, Set<Integer>>();
    Integer hashPosition; // position of #

    private List<State> Dstates; // list of the states in DAS
    private Map<State, Map<Character, State>> Dtrans = new HashMap<State, Map<Character, State>>(); // trans table

    public DAS(Node root)
    {
        Dstates = new ArrayList<State>();
        inputSymbols = root.getInputSymbols();
        inputSymbolNodes = root.getSymbolNodes();

        hashPosition = inputSymbolNodes.size();

        characterPosition = HashMultimap.create();
        for (Map.Entry<Integer, Character> e : inputSymbols.entrySet())
            if (e.getValue() != null)
                characterPosition.put(e.getValue(), e.getKey());


        State first = new State(counter, root.getFirst());
        Dstates.add(first);
        Dtrans.put(first, new HashMap<Character, State>()); // initialize
        existingStates.put(Dstates.get(0), root.getFirst());

        for(int T = 0; T < Dstates.size(); T++)
        {
            Dstates.get(T).setChecked(true);
            for (Character a : characterPosition.keySet()) // foreach input symbol a
            {
                Set<Integer> U = move(Dstates.get(T), a); // U = follow(p) where p - positions of a

                if (U.size() != 0 && !existingStates.containsValue(U)) { // if U is not empty and doesn't exist in Dstates
                    State addNewState = new State(++counter,U); // add new state with new ID
                    addNewState.setChecked(false); // mark as unchecked
                    Dstates.add(addNewState); // add to Dstates
                    Dtrans.put(addNewState, new HashMap<>()); // initialize this state in Dtrans table
                    if(U.contains(hashPosition))
                        addNewState.setTerminal(true); // if state contains hash, set as terminal
                    existingStates.put(addNewState, U); // add to auxiliary table
                    Dtrans.get(Dstates.get(T)).put(a, addNewState);
                } else {
                    State addToExisting = existingStates.entrySet().stream().filter(e -> e.getValue().equals(U))
                            .map(Map.Entry::getKey)
                            .findFirst().orElse(null);
                    Dtrans.get(Dstates.get(T)).put(a, addToExisting);
                }
            }
        }
        currentState = Dstates.get(0);
    }

    /* prints trans table */
    public void printTransTable()
    {
        for (State s: Dtrans.keySet())
        {
            for (Character c: Dtrans.get(s).keySet()) {
                if(Dtrans.get(s).get(c)!= null)
                    System.out.println("Dtrans["+s.getName() + "," + c + "] => " + Dtrans.get(s).get(c).name +" Terminal: " + Dtrans.get(s).get(c).isTerminal());
                else
                    System.out.println("Dtrans["+s.getName() + "," + c + "] => null");
            }
        }
    }

    /* move (State, c) = follow(p) where p - position of c */
    Set<Integer> move(State state, Character a )
    {
        Set<Integer> u = new HashSet<Integer>();
        for (Integer p: characterPosition.get(a)) // positions of input state a
        {
            if (state.getPositions().contains(p))
                u.addAll(inputSymbolNodes.get(p).getFollow()); // U = follow(p) where p - positions of a
        }

        return u;
    }

    public boolean takeCharacter (Character c) {

        State nextState = Dtrans.get(currentState).get(c);
        if (nextState == null)
            return false;

        currentState = nextState;
        return true;
    }

    public boolean reachTheEnd() {
        if (existingStates.get(currentState).contains(hashPosition))
            return true;
        return false;
    }

    public void resetAutomaton() {
        currentState = Dstates.get(0);
    }
}
