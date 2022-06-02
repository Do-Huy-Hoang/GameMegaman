/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itp.userinterface;

import java.awt.event.KeyEvent;

/**
 *
 * @author Asus
 */
public class InputManger {
     public void processKeyPressed(int keycode){
        switch (keycode) {
            //nut len
            case KeyEvent.VK_UP:
                System.out.println("Up");
                break;
            // nut xuong
            case KeyEvent.VK_DOWN:
                System.out.println("Down");
                break;
            //nut ben trai
            case KeyEvent.VK_LEFT:
                System.out.println("Left");
                break;
            //nut ben phai
             case KeyEvent.VK_RIGHT:
                System.out.println("Right");
                break;
            //nut enter
            case KeyEvent.VK_ENTER:
                System.out.println("Enter");
                break;
            //nut space
            case KeyEvent.VK_SPACE:
                System.out.println("Space");
                break;
            //phim a
            case KeyEvent.VK_A:
                System.out.println("A");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void processKeyReleased(int keycode){
        switch (keycode) {
            //nut len
            case KeyEvent.VK_UP:
                System.out.println("Up");
                break;
            // nut xuong
            case KeyEvent.VK_DOWN:
                System.out.println("Down");
                break;
            //nut ben trai
            case KeyEvent.VK_LEFT:
                System.out.println("Left");
                break;
            //nut ben phai
             case KeyEvent.VK_RIGHT:
                System.out.println("Right");
                break;
            //nut enter
            case KeyEvent.VK_ENTER:
                System.out.println("Enter");
                break;
            //nut space
            case KeyEvent.VK_SPACE:
                System.out.println("Space");
                break;
            //phim a
            case KeyEvent.VK_A:
                System.out.println("A");
                break;
            default:
                throw new AssertionError();
        }
    }
}
