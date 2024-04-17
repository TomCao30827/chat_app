/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Model_Date {
    
    public String getTime(){
        LocalDateTime current = LocalDateTime.now();
        System.out.println("thời gian hiện tại "+current);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return current.format(formatter);
    }

}
