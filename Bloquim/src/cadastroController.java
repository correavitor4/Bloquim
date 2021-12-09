import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class cadastroController {

    @FXML
    private PasswordField confirmaSenhaTextBox;

    @FXML
    private TextField emailTextBox;

    @FXML
    private Button feitoBtn;

    @FXML
    private TextField nomeTextBox;

    @FXML
    private PasswordField senhaTextBox;

    @FXML
    private Button voltarBtn;

    @FXML
    private Button xBtn;

    @FXML
    void confirmaSenhaUsuario(ActionEvent event) {

    }

    @FXML
    void emailUsuario(ActionEvent event) {

    }

    @FXML
    void fechaAba(ActionEvent event) {

    }

    @FXML
    void finalizaCadastro(ActionEvent event) {
        if(!validadorDeTexto.validarEmail(emailTextBox.getText())){
            System.out.println("Email inválido");
            return;
        }
        if(!validadorDeTexto.validarSenha(senhaTextBox.getText())){
            System.out.println("Senha inválida");
            return;
        }
    }

    @FXML
    void nomeUsuario(ActionEvent event) {

    }

    @FXML
    void senhaUsuario(ActionEvent event) {

    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage loginStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene loginScene = new Scene(root);
        loginStage.setScene(loginScene);
        loginStage.show();
    }

}
