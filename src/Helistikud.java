import java.util.*;

/**
 * Created by Kersti on 13.11.2016.
 */
//Programm põhineb kvindiringil
public class Helistikud {

    static String[] dieesidegahelistikenimed = {"C", "Cis", "D", "Dis", "E", "Eis", "Fis", "G", "Gis", "A", "Ais", "H"};
    static String[] dieesidedenimed = {"h#", "c#", "c##", "d#", "d##", "e#", "f#", "f##", "g#", "g##", "a#", "a##"};
    static String[] bemollidegahelistikenimed = {"C", "Des", "D", "Es", "E", "F", "Ges", "G", "As", "A", "B", "H"};
    static String[] bemollidenimed={"d♭♭","d♭","e♭♭", "e♭","f♭","g♭♭", "g♭","a♭♭", "a♭","b♭", "b","c♭"};

    public static Set<String> ühendaHelistikud() {
        Set<String> helistikud = new HashSet<>();
        helistikud.addAll(Arrays.asList(dieesidegahelistikenimed));
        helistikud.addAll(Arrays.asList(bemollidegahelistikenimed));
        return helistikud;
    }
    public static Set<String> ühendamärgid() {
        Set<String> märgid = new HashSet<>();
        märgid.addAll(Arrays.asList(dieesidedenimed));
        märgid.addAll(Arrays.asList(bemollidenimed));
        return märgid;
    }

    public static void main(String[] args) {
        System.out.println(getHelistikud());
    }

    public static HashMap<String, ArrayList<String>> getHelistikud() {

        ArrayList<Integer> dieesidegahelistikud = new ArrayList<>();
        ArrayList<Integer> dieesid = new ArrayList<>();
        ArrayList<Integer> bemollidegahelistikud = new ArrayList<>();
        ArrayList<Integer> bemollid = new ArrayList<>();

        //Loon indeksid selleks, et masiividest õiged nimed üles leida

        for (int i = 1; i < 13; i++) {
            dieesid.add(((i * 7) % 12) - 1); // Kuna massiivis on 12 elementi, siis tahan, et hakkaks jälle ühest peale. Samm on 7, kuna kvint koosneb seitsmest pooltoonist
            dieesidegahelistikud.add(((i-1) * 7) % 12);
            bemollid.add(((i+1)*5)%12);
            bemollidegahelistikud.add(((i-1)*5)%12);

        }
        HashMap<String, ArrayList<String>> asi = new HashMap<>();

        for (int i = 0; i < dieesidegahelistikud.size(); i++) {
            String praegune = dieesidegahelistikenimed[dieesidegahelistikud.get(i)];
            ArrayList<String> märgid = new ArrayList<>();


            for (int j = 0; j < i; j++) {
                märgid.add(dieesidedenimed[dieesid.get(j)]);
            }
            asi.putIfAbsent(praegune, märgid);

        }

        for (int i=0; i<bemollidegahelistikud.size(); i++) {
            String praegune = bemollidegahelistikenimed[bemollidegahelistikud.get(i)];
            ArrayList<String> märgid= new ArrayList<>();

            for ( int j =0; j<i; j++) {
                märgid.add(bemollidenimed[bemollid.get(j)]);
            }
            asi.putIfAbsent(praegune, märgid);
        }

        return asi;
    }
}
