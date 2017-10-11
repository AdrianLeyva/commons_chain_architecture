import commands.DataDisplayer;
import commands.DataReader;
import commands.PhraseSwaper;
import org.apache.commons.chain.impl.ChainBase;

/**
 * @author Adrián Leyva Sánchez
 */

public class AlgorithmChainBase extends ChainBase {

    public AlgorithmChainBase() {
        super();
        addCommand(new DataReader());
        addCommand(new PhraseSwaper());
        addCommand(new DataDisplayer());
    }
}
