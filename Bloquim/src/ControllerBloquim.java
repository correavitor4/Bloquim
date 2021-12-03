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


public class ControllerBloquim {


    @FXML
    private Button Botaologin;

    @FXML
    private Button botaoCadastro;

    @FXML
    private TextField passLabel;

    @FXML
    private Button recuperarSenha;

    @FXML
    private TextField userLabel;

    @FXML
    public void telaCadastro(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("telacadastro.fxml"));
        Stage cadastroStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene cadastroscene = new Scene(root);
        cadastroStage.setScene(cadastroscene);
        cadastroStage.show();

    }



    @FXML
    void telaInicial(ActionEvent event) {

    }

    @FXML
    void telaRecuperaSenha(ActionEvent event) {

    }

}
