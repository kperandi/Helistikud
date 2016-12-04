import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Kersti on 13.11.2016.
 */
//Programm põhineb kvindiringil
public class Helistikud {

    public static void main(String[] args) {
        System.out.println(getHelistikud());
    }

    public static HashMap<String, String> getHelistikud() {
        String[] dieesidegahelistikenimed = {"C", "Cis", "D", "Dis", "E", "Eis", "Fis", "G", "Gis", "A", "Ais", "H"};
        String[] dieesidedenimed = {"h#", "c#", "c##", "d#", "d##", "e#", "f#", "f##", "g#", "g##", "a#", "a##"};
        String[] bemollidegahelistikenimed = {"C", "Des", "D", "Es", "E", "F", "Ges", "G", "As", "A", "B", "H"};
        String[] bemollidenimed={"d♭♭","d♭","e♭♭", "e♭","f♭","g♭♭", "g♭","a♭♭", "a♭","b♭", "b","c♭"};
        ArrayList<Integer> dieesidegahelistikud = new ArrayList();
        ArrayList<Integer> dieesid = new ArrayList();
        ArrayList<Integer> bemollidegahelistikud = new ArrayList();
        ArrayList<Integer> bemollid = new ArrayList();

        //Loon indeksid selleks, et masiividest õiged nimed üles leida

        for (int i = 1; i < 8; i++) {
            dieesid.add(((i * 7) % 12) - 1); // Kuna massiivis on 12 elementi, siis tahan, et hakkaks jälle ühest peale. Samm on 7, kuna kvint koosneb seitsmest pooltoonist
            dieesidegahelistikud.add(((i-1) * 7) % 12);
            bemollid.add(((i+1)*5)%12);
            bemollidegahelistikud.add(((i-1)*5)%12);

        }
        HashMap<String, String> asi = new HashMap<>();

        for (int i = 0; i < dieesidegahelistikud.size(); i++) {
            String praegune = dieesidegahelistikenimed[dieesidegahelistikud.get(i)];
            String märgid = new String();


            for (int j = 0; j < i; j++) {
                märgid += dieesidedenimed[dieesid.get(j)];
            }
            asi.putIfAbsent(praegune, märgid);

        }

        for (int i=0; i<bemollidegahelistikud.size(); i++) {
            String praegune = bemollidegahelistikenimed[bemollidegahelistikud.get(i)];
            String märgid = new String();

            for ( int j =0; j<i; j++) {
                märgid += " " + bemollidenimed[bemollid.get(j)];
            }
            asi.putIfAbsent(praegune, märgid);
        }

        return asi;
    }
}
