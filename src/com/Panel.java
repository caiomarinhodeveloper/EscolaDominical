/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author Caio
 */
public class Panel extends JPanel{

    public Panel() {
    }
    
    public java.sql.Date getSqlDate() {
        Date date = new Date();
        return new java.sql.Date(date.getTime());
    }
    
}
