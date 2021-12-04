import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class loginController {

    @FXML
    private Button cadastroBtn;

    @FXML
    private Button feitoBtn;

    @FXML
    private TextField nomeTextField;

    @FXML
    private Button senhaPerdida;

    @FXML
    private PasswordField senhaTextBox;

    @FXML
    void irCadastro(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("telacadastro.fxml"));
        Stage cadastroStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene cadastroscene = new Scene(root);
        cadastroStage.setScene(cadastroscene);
        cadastroStage.show();
    }

    @FXML
    void loginUsuario(ActionEvent event) {

    }

    @FXML
    void realizaLogin(ActionEvent event) {

    }

    @FXML
    void recuperaSenha(ActionEvent event) {

    }

    @FXML
    void senhaUsuario(ActionEvent event) {

    }

}
