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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author clara
 */
public class SignupController implements Initializable {

    
    @FXML
    private VBox vbox;
    @FXML
    private Parent fxml;
    
    @FXML
    private Button signUpBtn;
    @FXML
    private Button backtologin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void openLogin (ActionEvent event) {
       try{
            fxml = FXMLLoader.load(getClass().getResource("login.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        }catch(IOException ex){
           //  Logger.getLogger(StartfrontController.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }
    
    @FXML
    private void signup(MouseEvent event) {
        System.out.println("youre now signed up :3");
    }

    @FXML
    private void singup(ActionEvent event) {
        System.out.println("youre now signed up :3");
    }
}
