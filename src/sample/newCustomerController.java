package sample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class newCustomerController {

  @FXML  public TextField newCustomerName;
  @FXML  public TextField newCustomerBithday;
  @FXML public TextField newCustomerVC;
  @FXML public TextField newCustomerCC;
  @FXML public Button saveButton;
  @FXML public Text savedToDBText;
  @FXML public Button newCustomerBackButton;

  public void handleBackAction(ActionEvent actionEvent) {
    try {
      Parent homePageParent = FXMLLoader.load(getClass().getResource("searchForCustomer.fxml"));
      Scene homePageScene = new Scene(homePageParent);
      Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
      homeStage.setScene(homePageScene);
      homeStage.show();
    } catch (IOException | NullPointerException e) {
      e.printStackTrace();
    }
  }

  public void handleSaveAction(ActionEvent actionEvent) {
    try {
      savedToDBText.setText("Saved to DataBase");
    } catch (NullPointerException e) {
      e.printStackTrace();
    }
  }
}
