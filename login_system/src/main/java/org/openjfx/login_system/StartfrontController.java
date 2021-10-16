/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.login_system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.scene.Parent;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;



/**
 * FXML Controller class
 *
 * @author clara
 */
public class StartfrontController implements Initializable {

    @FXML
    private VBox vbox;
    private Parent fxml;
    @FXML
    private Button exitBtn;
  
    @FXML
    private void handleClose(){
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try{
            fxml = FXMLLoader.load(getClass().getResource("login.fxml"));
            vbox.getChildren().removeAll();
            vbox.getChildren().setAll(fxml);
        }catch(IOException ex){
            
        }
    }    
}
