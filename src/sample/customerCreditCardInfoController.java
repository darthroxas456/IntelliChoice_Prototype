package sample;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class customerCreditCardInfoController {
@FXML public TextField creditCardText;
  public void handleDoneAction(ActionEvent actionEvent) {
    try{
      Parent homePageParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
      Scene homePageScene = new Scene(homePageParent);
      Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
      homeStage.setScene(homePageScene);
      homeStage.show();
    } catch (IOException | NullPointerException e) {
      e.printStackTrace();
    }
  }
}
