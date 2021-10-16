/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.login_system;

/**
 *
 * @author danie
 */
public class Message {
    int ID_message;
    String message;
    String sender;
    int Chatroom_ID;
    Message(int ID_m, String mes, String send, int C_ID){
        ID_message = ID_m;
        message = mes;
        sender = send;
        Chatroom_ID = C_ID;
    }
}
