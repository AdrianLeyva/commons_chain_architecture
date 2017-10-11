package commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import java.util.ArrayList;

/**
 * @author Adrián Leyva Sánchez
 */

public class DataDisplayer implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        ArrayList<String> phrasesList = (ArrayList<String>) context.get("phrasesList");

        for(String i : phrasesList){
            System.out.println(i);
        }

        return false;
    }
}
