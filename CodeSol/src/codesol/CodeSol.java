package codesol;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CodeSol extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        VBox mainPane = (VBox) FXMLLoader.load( getClass().getResource("/codesol/Main.fxml" ));        
        Scene scene = new Scene(mainPane);
        
        primaryStage.setTitle("Sample FX Multiple Forms");
        primaryStage.setScene(scene);
        //primaryStage.
        //primaryStage.setMaximized(true);    // make the main form fit to the screen
        primaryStage.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
