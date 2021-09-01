/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Andressa
 */
public class VidaPropria {
    
    public static void main(String[] args) throws AWTException{
        
        Robot robo = new Robot();
        robo.delay(5000);
        robo.mouseMove(600, 400);
        robo.mousePress(InputEvent.BUTTON3_MASK);
        robo.mouseRelease(InputEvent.BUTTON3_MASK);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_RIGHT);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_RIGHT);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
        //Ja criou a pasta sem nome
        
        robo.delay(3000);
        robo.keyPress(KeyEvent.VK_N);
        robo.delay(500);
        
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_I);
        robo.delay(500);

        robo.delay(500);
        robo.keyPress(KeyEvent.VK_C);
        robo.delay(500);   
        
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_O);
        robo.delay(500);
        
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_L);
        robo.delay(500);
        
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_S);
        robo.delay(500);
        
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(100);
            
        robo.keyRelease(KeyEvent.VK_ENTER);
    }
    
}
