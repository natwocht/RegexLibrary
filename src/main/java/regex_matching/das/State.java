package regex_matching.das;
import java.util.Set;

/* Class that implements state of DFA automat */
public class State {

    boolean terminal; // indicates whether state is terminal
    boolean checked; // indicates whether state is checked
    Set<Integer> charactersIDs; // set of positions in state
    char name;

    public State(char name, Set<Integer> charactersIDs)
    {
        this.name = name;
        this.charactersIDs = charactersIDs;
        this.terminal = false;
        this.checked = false;
    }

    /* get state ID */
    public char getName() {
        return name;
    }

    /* indicates if state is terminal or not */
    public boolean isTerminal() {
        return terminal;
    }

    /**/
    public Set<Integer> getPositions() {
        return charactersIDs;
    }

    public void setTerminal(boolean terminal) {
        this.terminal = terminal;
    }

    public void setCharactersIDs(Set<Integer> charactersIDs) {
        this.charactersIDs = charactersIDs;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
