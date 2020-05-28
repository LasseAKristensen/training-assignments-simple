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
public class Mail {
    private MailAddress address;
    private MailBody body;
    
    private Mail(MailAddress mAddress, MailBody mBody){
        this.address = mAddress;
        this.body = mBody;
    }
}
