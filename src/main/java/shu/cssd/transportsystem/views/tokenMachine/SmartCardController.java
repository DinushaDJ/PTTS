package shu.cssd.transportsystem.views.tokenMachine;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SmartCardController {
    @FXML
    private void smartCardButtonClick(MouseEvent event) throws IOException {
        Parent smcParent = FXMLLoader.load(getClass().getResource("/tokenMachine/login/login.fxml"));
        Scene smcScene = new Scene(smcParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(smcScene);
        window.show();
    }

    @FXML
    private void backButtonClick(MouseEvent event) throws IOException {
        Parent homeParent = FXMLLoader.load(getClass().getResource("/tokenMachine/home/home.fxml"));
        Scene homeScene = new Scene(homeParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(homeScene);
        window.show();
    }
}
