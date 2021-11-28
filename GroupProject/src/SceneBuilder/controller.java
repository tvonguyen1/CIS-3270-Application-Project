package SceneBuilder;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;  
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class controller implements Initializable{
	private Scene login;
	 
	 public void setLogin (Scene scene) {
		 login = scene;
	 }
	 
	 public void openLogin(MouseEvent event) {
	        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.setScene(login);
	    }
	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

}
