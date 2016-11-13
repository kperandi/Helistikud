import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Kersti on 13.11.2016.
 */
//Programm põhineb kvindiringil
public class DieesidegaHelistikud {
    public static void main(String[] args) {
        ArrayList<Integer> helistikud=new ArrayList();
        ArrayList<Integer> margid=new ArrayList();
        String[] helistikenimed= {"C","Cis","D","Dis","E","Eis","Fis","G","Gis","A","Ais","H"};
        String[] markidenimed= {"h#","c#","d","d#","e","e#","f#","g","g#","a","a#","h"};

        //Loon indeksid selleks, et masiividest õiged nimed üles leida
        for (int i=1; i<9; i++) {
            margid.add(((i*7)%12)-1); // Kuna massiivis on 12 elementi, siis tahan, et hakkaks jälle ühest peale. Samm on 7, kuna kvint koosneb seitsmest pooltoonist
            helistikud.add(((i-1)*7)%12);
        }

        for (int i=0; i<helistikud.size(); i++ ) {
            System.out.println("Helistik: "+ helistikenimed[helistikud.get(i)]);
            System.out.println("Märgid: ");
            for (int j=0; j<i; j++) {
                System.out.println(markidenimed[margid.get(j)]);
            }
            System.out.println("----------");
        }
    }



}