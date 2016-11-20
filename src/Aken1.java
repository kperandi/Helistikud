import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by Kersti on 20.11.2016.
 */
public class Aken1 extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {

        Pane kast = new Pane();
        Scene harjutus = new Scene(kast, 260, 260);
        primaryStage.setScene(harjutus);
        primaryStage.setTitle("Harjutamine");
        primaryStage.show();

        Label ulesanne = new Label("Vali helistik!");
        ulesanne.setTranslateX(20);
        ulesanne.setTranslateY(20);

        Button C = new Button("C");
        C.setTranslateX(20);
        C.setTranslateY(60);
        C.setPrefSize(40,40);

        Button Des = new Button("Des");
        Des.setTranslateX(80);
        Des.setTranslateY(60);
        Des.setPrefSize(40,40);

        Button D = new Button("D");
        D.setTranslateX(140);
        D.setTranslateY(60);
        D.setPrefSize(40,40);

        Button Es = new Button("Es");
        Es.setTranslateX(200);
        Es.setTranslateY(60);
        Es.setPrefSize(40,40);

        Button E = new Button("E");
        E.setTranslateX(20);
        E.setTranslateY(120);
        E.setPrefSize(40,40);

        Button F = new Button("F");
        F.setTranslateX(80);
        F.setTranslateY(120);
        F.setPrefSize(40,40);

        Button Ges = new Button("Ges");
        Ges.setTranslateX(140);
        Ges.setTranslateY(120);
        Ges.setPrefSize(40,40);

        Button G = new Button("G");
        G.setTranslateX(200);
        G.setTranslateY(120);
        G.setPrefSize(40,40);

        Button As = new Button("As");
        As.setTranslateX(20);
        As.setTranslateY(180);
        As.setPrefSize(40,40);

        Button A = new Button("A");
        A.setTranslateX(80);
        A.setTranslateY(180);
        A.setPrefSize(40,40);

        Button B = new Button("B");
        B.setTranslateX(140);
        B.setTranslateY(180);
        B.setPrefSize(40,40);

        Button H = new Button("H");
        H.setTranslateX(200);
        H.setTranslateY(180);
        H.setPrefSize(40,40);


        kast.getChildren().addAll(ulesanne, C, Des, D, Es, E, F, Ges, G, As, A, B, H);
    }
}
