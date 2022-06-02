
package com.itp.userinterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, KeyListener{
    private Thread thread;
    private boolean isRunning;
    private InputManger inputManager;
    
    public GamePanel(){
        inputManager = new InputManger();
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(0, 0, GameFrame.SCREEN_WITH, GameFrame.SCREEN_HEIGHT);
    };

    public void StratGame(){
        if (thread == null) {
            isRunning = true; //check xem game chay chua
            thread = new Thread(this);
            thread.start();
        }
    }
    @Override
    public void run() {
        long FTS = 60;
        long period = 1000*1000000/FTS;
        long beginTime;
        long sleppTime;
        
             
        int a = 1;
        beginTime = System.nanoTime(); 
        while (isRunning) {
            //System.out.println(a++);
            //Update
            //Render
            long deltaTiem = System.nanoTime()- beginTime;//lay thoi gian tren he thong pc
            sleppTime = period - deltaTiem;//tinh thoi gian ngu
            try {
                if (sleppTime > 0) {
                    thread.sleep(sleppTime/1000000);
                }else{
                    thread.sleep(period/2000000);
                }
                
            } catch (InterruptedException ex) {}
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
    inputManager.processKeyPressed(e.getKeyCode());
    
    //khi nhan dung nut thi thuc hien lenh
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        inputManager.processKeyReleased(e.getKeyCode());
    }
}

