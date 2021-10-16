/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.login_system;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 * @author clara
 */
public class MainController {

    TextField chatBar;
    @FXML
    TextField secondaryTextField;
    TextFlow chatDisplay;
    String chatBarInput;

    @FXML
public void textFieldEnter(KeyEvent e){
    //if (chatBar.getText() != null){
    if (e.getCode().equals(KeyCode.ENTER)){
       // chatBarInput = secondaryTextfield.getText();
        //System.out.println(chatBarInput);
       System.out.println(secondaryTextField.getText());
    }

} 

}
