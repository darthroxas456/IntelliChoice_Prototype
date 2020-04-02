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

public class searchForCustomerController {

  @FXML public Button searchButton;
  @FXML public TextField searchNameText;
  @FXML public Text searchErrorText;
  @FXML public Button searchLogoutButton;
  @FXML public Button newCustomerButton;

  public void handleBackAction(ActionEvent actionEvent) {
    try {
      Parent homePageParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
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
      if(searchNameText.getText().equals("")){
        searchErrorText.setText("Please Enter Customer's Name");
      } else if(!searchNameText.getText().equals("John Smith")){
        searchErrorText.setText("Customer Doesn't Exist");
      }else{
        Parent homePageParent = FXMLLoader.load(getClass().getResource("customerCredentials.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        homeStage.setScene(homePageScene);
        homeStage.show();
      }
    }catch(IOException | NullPointerException e){
      if(searchNameText.getText().equals("")){
        searchErrorText.setText("Please Enter Password");
      } else if(!searchNameText.getText().equals("John Smith")){
        searchErrorText.setText("Customer Doesn't Exist");
      }
    }
  }
  public void handleNewCustomerAction(ActionEvent actionEvent){
    try{
        Parent homePageParent = FXMLLoader.load(getClass().getResource("newCustomer.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        homeStage.setScene(homePageScene);
        homeStage.show();
    }catch(IOException | NullPointerException e){
      System.out.println("the newCustomer action is being caught!");
    }
  }
}
