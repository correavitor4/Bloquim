import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("telalogin.fxml"));
=======
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/Login.fxml"));
>>>>>>> 664ee64742e47ebe5dce6a2277022a4e5504b52a
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Bloquim");
        primaryStage.setScene(tela);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }
}