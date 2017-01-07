
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Kersti on 20.11.2016.
 */
public class Aken1 {

    public Aken1() {

        Stage primaryStage = new Stage();
        Pane kast = new Pane();
        Scene oppimine = new Scene(kast, 260, 260);
        primaryStage.setScene(oppimine);
        primaryStage.setTitle("Õppimine");
        primaryStage.show();

        Label ulesanne = new Label("Vali helistik!");
        ulesanne.setTranslateX(20);

        Alert vastused = new Alert(Alert.AlertType.INFORMATION);

        FlowPane nupud = new FlowPane();
        nupud.setPadding(new Insets(20, 20, 20, 20));
        nupud.setVgap(20);
        nupud.setHgap(20);
        nupud.setPrefWrapLength(220);

        LinkedHashMap <String, Button> nuppudekogum = new LinkedHashMap();
        for (String helistikud: Helistikud.ühendaHelistikud()){
            nuppudekogum.put(helistikud, new Button(helistikud));
        }


        HashMap<String, ArrayList<String>> helistikud = Helistikud.getHelistikud();

        for (Button value : nuppudekogum.values()) {
            value.setOnAction((event) -> {
                vastused.setContentText(helistikud.get(value.getText()).toString());
                vastused.setTitle("Märgid");
                vastused.setHeaderText(value.getText()+"-duuris on sellised märgid:");
                vastused.show();



            });
        }


        nupud.getChildren().addAll(nuppudekogum.values());
        kast.getChildren().addAll(ulesanne, nupud);
    }
}
