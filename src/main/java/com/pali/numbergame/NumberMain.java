/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pali.numbergame;

import java.util.Scanner;

/**
 *
 * @author Nitesh Paliwal
 */
public class NumberMain {
    
    
    public static void main (String [] args) {
        
     
    Scanner num = new Scanner(System.in);
    
    System.out.println("Enter the First Number for Addition");
    int firstNum = num.nextInt();
    
    System.out.println("Enter the Second Number for Addition");
    int secondNum = num.nextInt();
        
    int result = firstNum + secondNum;
    
    System.out.println("Add of two number is;" +result);
    
    }
 
    
    
}
