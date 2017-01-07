import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.plaf.OptionPaneUI;
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
        nuppudekogum.put("C", new Button("C"));
        nuppudekogum.put("Des", new Button("Des"));
        nuppudekogum.put("D", new Button("D"));
        nuppudekogum.put("Es", new Button("Es"));
        nuppudekogum.put("E", new Button("E"));
        nuppudekogum.put("F", new Button("F"));
        nuppudekogum.put("Ges", new Button("Ges"));
        nuppudekogum.put("G", new Button("G"));
        nuppudekogum.put("As", new Button("As"));
        nuppudekogum.put("A", new Button("A"));
        nuppudekogum.put("B", new Button("B"));
        nuppudekogum.put("H", new Button("H"));


        HashMap<String, String> helistikud = Helistikud.getHelistikud();

        for (Button value : nuppudekogum.values()) {
            value.setOnAction((event) -> {
                vastused.setContentText(helistikud.get(value.getText()));
                vastused.setTitle("Märgid");
                vastused.setHeaderText(value.getText()+"-duuris on sellised märgid:");
                vastused.show();



            });
        }


        nupud.getChildren().addAll(nuppudekogum.values());
        kast.getChildren().addAll(ulesanne, nupud);
    }
}
