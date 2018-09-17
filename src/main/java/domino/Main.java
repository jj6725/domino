package domino;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jnativehook.NativeHookException;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../resources/sample.fxml"));
        Parent root = loader.load();
        domino.Controller mainController = loader.getController();

        primaryStage.setTitle("Mouse and Key Logging");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException, NativeHookException {
        EventLooper.main();
        launch(args);
    }
}
