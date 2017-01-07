import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Kersti on 13.11.2016.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane aken = new Pane();
        Scene valik = new Scene(aken, 250, 250);
        primaryStage.setScene(valik);
        primaryStage.setTitle("Helistikud");
        primaryStage.show();

        Label ylesanne = new Label("Kas soovid õppida või mängida?");
        ylesanne.setTranslateX(20);
        Button oppimine = new Button("Õppima!");
        oppimine.setTranslateX(20);
        oppimine.setTranslateY(40);
        Button mangimine = new Button("Mängima!");
        mangimine.setTranslateX(20);
        mangimine.setTranslateY(80);

        oppimine.setOnAction(event -> {
            new Aken1();
                });

        mangimine.setOnAction(event -> {
            new Aken2();
        });


        aken.getChildren().addAll(ylesanne, oppimine, mangimine);
    }


}
