package sample;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class customerCredentialsController {
  @FXML public TextArea verifyInfoBox;
  @FXML public Button verifiedButton;
  @FXML public Button verifyBackButton;

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

  public void handleConfirmationAction(ActionEvent actionEvent){
    try{
        Parent homePageParent = FXMLLoader.load(getClass().getResource("customerCreditCardInfo.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        homeStage.setScene(homePageScene);
        homeStage.show();
    }catch(IOException | NullPointerException e){
      System.out.println("the verified Button is broken");
    }
  }
}
