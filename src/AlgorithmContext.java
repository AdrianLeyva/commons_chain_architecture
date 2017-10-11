import org.apache.commons.chain.impl.ContextBase;

import java.util.ArrayList;

/**
 * @author Adrián Leyva Sánchez
 */

public class AlgorithmContext extends ContextBase {
    private ArrayList<String> phrasesList;
    private String[] splitsOnRuntime;

    public ArrayList<String> getPhrasesList() {
        return phrasesList;
    }

    public void setPhrasesList(ArrayList<String> phrasesList) {
        this.phrasesList = phrasesList;
    }

    public String[] getSplitsOnRuntime() {
        return splitsOnRuntime;
    }

    public void setSplitsOnRuntime(String[] splitsOnRuntime) {
        this.splitsOnRuntime = splitsOnRuntime;
    }
}
