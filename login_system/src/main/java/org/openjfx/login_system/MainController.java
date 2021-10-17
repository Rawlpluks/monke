/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.login_system;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.TextFlow;
import static org.openjfx.login_system.App.db;

/**
 * FXML Controller class
 *
 * @author clara
 */
public class MainController {

    @FXML TextField chatBar;
    @FXML Button sendKnap;
    @FXML Label chatDisplay;
    
    String chatBarInput;
    
    //temporary variables. Delete before handing in
    String currentSender = "Adam";
    int currentChatRoom = 1;
    
        
    
    
    
    @FXML
public void textFieldEnter(KeyEvent e){
    //if (chatBar.getText() != null){
    //if (e.getCode().equals(KeyCode.ENTER)){
       //chatBarInput = chatBar.getText();
        //System.out.println(chatBarInput);
       //System.out.println(chatBar.getText());
    //}

}

    @FXML
public void sendButton() throws IOException, Exception{
    
    chatBarInput = chatBar.getText();
    System.out.println(chatBarInput);
    Message mess = new Message(-1, chatBarInput, currentSender, currentChatRoom);
    Database db = new Database();
    
    db.savemessage(mess);
    
    
    chatBar.setText("");
}

}
//}
