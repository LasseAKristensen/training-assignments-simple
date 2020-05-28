/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sig.training.ch05.buildandsendmail;

/**
 *
 * @author lk
 */
public class MailAddress {
    private String mId;
    
    private MailAddress(String firstName, String lastName, String division){
        this.mId = firstName.charAt(0) + "." + lastName.substring(0,7)
                + "@" 
                + division.substring(o,5) + ".compa.ny";
    }
}
