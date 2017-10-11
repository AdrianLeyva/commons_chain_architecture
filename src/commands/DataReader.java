package commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Adrián Leyva Sánchez
 */

public class DataReader implements Command{
    @Override
    public boolean execute(Context context) throws Exception {
        ArrayList<String> phrasesList = (ArrayList<String>) context.get("phrasesList");
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while(flag ){
            String aux;
            System.out.println("Ingrese una oración: ");
            aux = in.nextLine();

            if(aux.equals("FINISH"))
                flag = false;
            else
                phrasesList.add(aux);
        }

        return false;
    }
}
