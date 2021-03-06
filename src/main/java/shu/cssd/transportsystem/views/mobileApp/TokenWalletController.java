package shu.cssd.transportsystem.views.mobileApp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import shu.cssd.transportsystem.controllers.UserController;
import shu.cssd.transportsystem.models.Token;
import shu.cssd.transportsystem.views.mobileApp.content.TokenListCell;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TokenWalletController implements Initializable
{
	
	@FXML
	private ListView<Token> tokenList;
	
	private ArrayList<Token> tokens;
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		this.tokenList.setCellFactory(param -> new TokenListCell());
		
		this.tokens = UserController.currentUser.getTokens();
		
		for (Token token: tokens)
		{
			tokenList.getItems().add(token);
		}
	}
	
	@FXML
	private void backButtonClick(MouseEvent event) throws IOException
	{
		Parent tokenParent = FXMLLoader.load(getClass().getResource("/mobileApp/token/token.fxml"));
		Scene tokenScene = new Scene(tokenParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(tokenScene);
		window.show();
	}
	
	@FXML
	private void paymentButtonClick(MouseEvent event) throws IOException
	{
		Parent paymentParent = FXMLLoader.load(getClass().getResource("/mobileApp/payment/Payment.fxml"));
		Scene paymentScene = new Scene(paymentParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(paymentScene);
		window.show();
	}
	
	@FXML
	private void profileButtonClick(MouseEvent event) throws IOException
	{
		Parent profileParent = FXMLLoader.load(getClass().getResource("/mobileApp/profile/profile.fxml"));
		Scene profileScene = new Scene(profileParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(profileScene);
		window.show();
	}
	
	@FXML
	private void routeButtonClick(MouseEvent event) throws IOException
	{
		Parent routeParent = FXMLLoader.load(getClass().getResource("/mobileApp/route/route.fxml"));
		Scene routeScene = new Scene(routeParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(routeScene);
		window.show();
	}
	
	@FXML
	private void journeyButtonClick(MouseEvent event) throws IOException
	{
		Parent journeyParent = FXMLLoader.load(getClass().getResource("/mobileApp/journey/journey.fxml"));
		Scene journeyScene = new Scene(journeyParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(journeyScene);
		window.show();
	}
}
