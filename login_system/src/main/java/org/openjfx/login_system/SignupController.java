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
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author clara
 */
public class SignupController implements Initializable {

    
    @FXML
    private VBox vbox;
    private Parent fxml;
    
    @FXML
    private Button signUpBtn;
    @FXML
    private Button backtologin;
    @FXML
    private TextField newUsername;
    @FXML
    private PasswordField newPassword;
    @FXML
    private Text signupText;
    
    boolean newUser = false;
    
    private void cleartxt(){
        newUsername.clear();
        newPassword.clear();
    }
    
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
    private void signupBtn () throws IOException, Exception {
        System.out.println("youre now signed up :3");
        
        //er tekstfeltet tomt eller ej 
        if(!newUsername.getText().isBlank() && !newPassword.getText().isBlank()){
           newUser = true;
           
        //laver og tilføjer den nye bruger til databasen
        Database db = new Database();
        db.saveUser(new User (-1, newUsername.getText(),newPassword.getText()));
        if(newUser == true) {
           signupText.setText("Bruger oprettet!");
           cleartxt();
           newUser = false;
        }else{
            signupText.setText("Der skete en fejl");
        }
      }
    }

    
    
}
