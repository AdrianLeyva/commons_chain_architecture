import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import java.util.ArrayList;

/**
 * @author Adrián Leyva Sánchez
 */

public class Main {
    public static void main(String[] args) {
        Context context = new AlgorithmContext();
        context.put("phrasesList", new ArrayList<>());

        Catalog catalog = new AlgorithmCatalog();
        Command command = catalog.getCommand("algorithmChainBase");

        try {
            command.execute(context);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
