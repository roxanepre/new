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

/*public class AccueilView {
    public static Stage fenetre_principale ;//on peut déclarer la fenetre_principale, mais on l'instancie dans le constructeur
    VBox pane_welcome = new VBox(50);
    Scene scene = new Scene(pane_welcome,400,300);//ici j'ai renommé scene_welcomme en scene car cette scene
    //va servir pour toute les vues, on va juste changer son layout
    Label welcome = new Label("Bienvenue dans l'application de votre atelier !");
    Button enter_atelier = new Button("Entrer dans l'atelier");
    // pane_welcome.getChildren().addAll(welcome,enter_atelier); //cette ligne ne marche pas car il n'y a pas de constructeur
    
    public AccueilView(Stage stage) {
        AccueilView.fenetre_principale = stage;
        pane_welcome.getChildren().addAll(welcome,enter_atelier);//s'il y a des chose à faire autre que declaration et initialisation,
        //il faut le faire dans le constructeur
        stage.setTitle("Atelier de fabrication");//AccueilView.fenetre_principale s'appelle stage !
        
        //il faut bien mettre cette ligne dans le constructeur
        stage.setScene(scene);// le this est inutile, les variable on été déclarerau début de la classe
        //elle sont direct des attribut de classe
        
        //AccueilView acc_view = new AccueilView(AccueilView.fenetre_principale);On ne peut pas faire ça 
        // ( appeler le constructeur dans le constructeur....
        ControleAccueil controleur = new ControleAccueil(this);   //là il faut passer la l'instance d'AccueilView en paramètre, 
        //c'est à dire this
        enter_atelier.setOnAction(evt -> {controleur.afficher(/*AccueilView.fenetre_principale/);});
    }

    public Scene getScene() {
        return scene;
    }
        

    public static Stage getFenetre_principale() {
        return fenetre_principale;
    }

    public void setFenetre_principale(Stage fenetre_principale) {
        AccueilView.fenetre_principale = fenetre_principale;
    }*/
 