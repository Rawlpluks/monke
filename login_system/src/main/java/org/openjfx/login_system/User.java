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
public class User {
     int userId;
     String userName;
     String passWord;
    
    public User() {}
    
    User(int uId, String uName, String pWord){
      userId = uId;  
      userName = uName;
      passWord = pWord;
    }
    
    public int getUserID(){
        return userId;
    }
    
    public String getUserUN() {
        return userName;
    }
    
    public String getUserPW() {
        return passWord;
    }
    
  
    
}
