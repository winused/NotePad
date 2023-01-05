/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notepad;

import javax.swing.*;

/**
 *
 * @author nly
 */
public class ObjectFactory {
    
    JFileChooser jfc;
    //Singleton
    public JFileChooser getFileChooser(){
        if (jfc ==null){
            jfc = new JFileChooser();}
        return jfc;
    }
}
