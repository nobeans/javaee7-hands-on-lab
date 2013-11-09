/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.co.oracle.cdis;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ynak
 */
@Named(value = "indexManage")
@RequestScoped
public class IndexPageMgdBean {

    private String message;
    
    /**
     * Creates a new instance of IndexPageMgdBean
     */
    public IndexPageMgdBean() {
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
 
    public String pushSendButton() {
        System.out.println(getMessage());
        return "";
    }
}
