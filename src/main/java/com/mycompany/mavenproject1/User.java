/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;

/**
 *
 * @author RENT
 */
public class User implements Serializable {
    String name;
    String lastName;
    
    void setName (String name){
        this.name = name;
    }
    
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
