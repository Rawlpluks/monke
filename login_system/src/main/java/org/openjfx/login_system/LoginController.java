/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.login_system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author clara
 */
public class LoginController {
    @FXML
    private VBox vbox;
    @FXML
    private Parent fxml;
    
    @FXML
    private Button loginBtn;
    @FXML
    private Button signupBtn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    
    @FXML
    private void openSignup(ActionEvent event) {
         try {
             fxml = FXMLLoader.load(getClass().getResource("signup.fxml"));
             vbox.getChildren().removeAll();
             vbox.getChildren().setAll(fxml);
                        
         } catch (IOException ex) {
            // Logger.getLogger(FrontPageController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @FXML
    private void switchToMain(ActionEvent event) throws IOException {
        App.setRoot("main");
    }

    
    

    
}
