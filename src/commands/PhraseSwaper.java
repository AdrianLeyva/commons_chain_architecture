package commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import java.util.ArrayList;

/**
 * @author Adrián Leyva Sánchez
 */


public class PhraseSwaper implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        ArrayList<String> phrasesList = (ArrayList<String>) context.get("phrasesList");

        for(String item : phrasesList){
            String[] splits = item.split(" ");
            printDataSplits(splits);
            System.out.println("\n\n\n");
        }

        return false;
    }



    private static void printDataSplits(String[] splits){
        int index = 0;
        String aux = "";

        while(index < splits.length){

            for(int i=0; i<splits.length; i++){
                System.out.print(splits[i] + " ");
            }

            System.out.println("\n");

            try{
                aux = splits[index + 1];
                splits[index + 1] = splits[index];
                splits[index] = aux;
                index++;
            }
            catch(IndexOutOfBoundsException e){
                return;
            }
        }
    }


}
