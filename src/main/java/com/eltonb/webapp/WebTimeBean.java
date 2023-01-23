/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.webapp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author elton.ballhysa
 */
@ManagedBean(name = "myBean")
@SessionScoped
public class WebTimeBean implements Serializable
{ 
    public WebTimeBean() {
    }
           
    // return the time on the server at which the request was received
    public String getTime() {
        Date now = new Date();
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(now);
    } 
}
