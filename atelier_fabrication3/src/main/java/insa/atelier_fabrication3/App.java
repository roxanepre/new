package insa.atelier_fabrication3;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import view.AccueilView;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
       AccueilView main_w = new AccueilView(stage);
       stage.setTitle("Atelier de fabrication");
       stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
 