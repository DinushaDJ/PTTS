package shu.cssd.transportsystem.views.mobileApp;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import shu.cssd.transportsystem.MainApp;
import shu.cssd.transportsystem.controllers.UserController;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable
{
	@FXML
	public JFXTextField topUpAmount;
	
	private UserController userController;
	
	@FXML
	private Label balance;
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		this.userController = UserController.getInstance();
		
		//topPane.setEffect(new DropShadow(2d, 0d, +2d, Color.BLACK));
		
		balance.setText(Float.toString(UserController.currentUser.balance));
	}
	
	@FXML
	public void loadDashBoard(javafx.event.ActionEvent event) throws IOException
	{

		
		Parent parent = FXMLLoader.load(getClass().getResource("dashboard/Dashboard.fxml"));

		Scene scene = new Scene(parent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(scene);
		window.show();
	}
	
	@FXML

	private void logout_buttonClick(MouseEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("/login/Scene.fxml"));
		MainApp.stage.getScene().setRoot(root);
	}
	
	@FXML
	private void smartCardButtonClick(MouseEvent event) throws IOException
	{
		Parent paymentParent = FXMLLoader.load(getClass().getResource("/payment/Payment.fxml"));
		Scene paymentScene = new Scene(paymentParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(paymentScene);
		window.show();
	}
	
	@FXML
	private void journeyButtonClick(MouseEvent event) throws IOException
	{
		Parent journeyParent = FXMLLoader.load(getClass().getResource("/journey/journey.fxml"));
		Scene journeyScene = new Scene(journeyParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(journeyScene);
		window.show();
	}
	
	@FXML
	private void timetableButtonClick(MouseEvent event) throws IOException
	{
		Parent timetableParent = FXMLLoader.load(getClass().getResource("/timetable/timetable.fxml"));
		Scene timetableScene = new Scene(timetableParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(timetableScene);
		window.show();
	}
	
	@FXML

	private void profileButtonClick(MouseEvent event) throws IOException
	{
		Parent profileParent = FXMLLoader.load(getClass().getResource("/profile/profile.fxml"));

		Scene profileScene = new Scene(profileParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(profileScene);
		window.show();
	}

	
	@FXML
	private void tokenButtonClick(MouseEvent event) throws IOException
	{
		Parent tokenParent = FXMLLoader.load(getClass().getResource("/token/token.fxml"));
		Scene tokenScene = new Scene(tokenParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(tokenScene);
		window.show();
	}
	
	@FXML
	private void routeButtonClick(MouseEvent event) throws IOException
	{
		Parent routeParent = FXMLLoader.load(getClass().getResource("/route/route.fxml"));

		Scene routeScene = new Scene(routeParent);
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(routeScene);
		window.show();
	}
	
	public void topupButtonClick(MouseEvent mouseEvent)
	{
		//UserController user = new UserController();
		
		System.out.println(userController.currentUser.name);
		
		float amount = Float.valueOf(topUpAmount.getText());
		
		float newBalance = userController.topUpBalance(amount);
		
		System.out.println(Float.toString(newBalance));
		
		balance.setText("LKR " + Float.toString(newBalance));
		
	}
}