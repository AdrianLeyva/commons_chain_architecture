import org.apache.commons.chain.impl.CatalogBase;

/**
 * @author Adrián Leyva Sánchez
 */

public class AlgorithmCatalog extends CatalogBase {

    public AlgorithmCatalog() {
        super();
        addCommand("algorithmChainBase", new AlgorithmChainBase());
    }
}
