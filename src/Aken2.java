import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.*;

/**
 * Created by Kersti on 11.12.2016.
 */
public class Aken2 {

    public Aken2 () {

        Stage blabla = new Stage();
        Pane kast = new Pane();
        Scene testimine = new Scene(kast, 300, 500);
        blabla.setScene(testimine);
        blabla.setTitle("Testimine");
        blabla.show();

        String a = getRandomHelistik();
        Label küsimus = new Label("Mis märgid on "+a+"-duuris?");

        FlowPane märkidepaneel = new FlowPane();
        märkidepaneel.setPadding(new Insets(20, 20, 20, 20));
        märkidepaneel.setOrientation(Orientation.VERTICAL);

        Set <CheckBox> märkidekogum = new HashSet<>();

        for (String märk: Helistikud.ühendamärgid()){
            märkidekogum.add(new CheckBox(märk));

        }

        Alert tulemus = new Alert(Alert.AlertType.INFORMATION);
        tulemus.setTitle("Tulemus");


        final int[] proovimistearv = {0};
        Button kontrolli= new Button("Kontrolli");
        kontrolli.setOnAction((event) -> {
            proovimistearv[0] +=1;
            if (kontrolliseisu(märkidekogum,a)) {
                tulemus.setContentText("Õige vastus, proovimiste arv: " + proovimistearv[0]);
                blabla.close();
            }
            else {
                tulemus.setContentText("Vale vastus, proovi uuesti");
            }
            tulemus.show();

        });

        märkidepaneel.getChildren().addAll(märkidekogum);
        märkidepaneel.getChildren().addAll(kontrolli);
        kast.getChildren().addAll(küsimus, märkidepaneel);

    }

    private boolean kontrolliseisu(Set<CheckBox> märkidekogum, String a) {
        Set<String> valitud= new HashSet<>();
        for (CheckBox checkBox : märkidekogum) {
            if (checkBox.isSelected()){
                valitud.add(checkBox.getText());
            }
        }
        System.out.println(valitud);
        System.out.println(Helistikud.getHelistikud().get(a));
        return valitud.equals(new HashSet<>(Helistikud.getHelistikud().get(a)));

    }

    private String getRandomHelistik() {
        Set<String> helistikud = Helistikud.ühendaHelistikud();
        int arv = helistikud.size();
        int mitmes = new Random().nextInt(arv);
        int i = 0;
        for (String helistik: helistikud){
            if (i==mitmes)
                return helistik;
            i++;
        }
        return "Viga";
    }


}
