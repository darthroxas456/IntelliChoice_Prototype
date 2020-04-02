package sample;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Controller {

  @FXML public Text loginError;
  @FXML public TextField loginText;
  @FXML public Button loginButton;


  public void handleConfirmationAction(ActionEvent actionEvent){
    try{
      if(loginText.getText().equals("")){
        loginError.setText("Please Enter Password");
      } else if(!loginText.getText().equals("IntelliChoice")){
        loginError.setText("Incorrect Password");
      }else{
        Parent homePageParent = FXMLLoader.load(getClass().getResource("searchForCustomer.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        homeStage.setScene(homePageScene);
        homeStage.show();
      }
    }catch(IOException e){
      if(loginText.getText().equals("")){
        loginError.setText("Please Enter Password");
      } else if(!loginText.getText().equals("IntelliChoice")){
        loginError.setText("Incorrect Password");
      }
    }
  }
}
