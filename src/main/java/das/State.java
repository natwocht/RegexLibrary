package das;
import java.util.Set;

public class State {

    boolean terminal; // indicates whether state is terminal
    boolean checked; // indicates whether state is checked
    Set<Integer> positions; // set of positions in state

    public char getName() {
        return name;
    }

    char name;

    public State(char name, Set<Integer> positions)
    {
        this.name = name;
        this.positions = positions;
        this.terminal = false;
        this.checked = false;
    }

    public boolean isTerminal() {
        return terminal;
    }

    public Set<Integer> getPositions() {
        return positions;
    }

    public void setTerminal(boolean terminal) {
        this.terminal = terminal;
    }

    public void setPositions(Set<Integer> positions) {
        this.positions = positions;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
