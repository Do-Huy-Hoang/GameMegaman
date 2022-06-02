
package com.itp.userinterface;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
    // khai bao bien co the truy xuat truc tiep va khong the sai
    public static final int SCREEN_WITH =1000;
    public static final int SCREEN_HEIGHT =600;
    // khai bao GamePanel
    GamePanel gamepanel;
    public GameFrame(){
        Toolkit toolkit = this.getToolkit();//lay size cua man hinh hien tai
        Dimension dimension = toolkit.getScreenSize();//gan size vao doi tuong toolkit
        this.setBounds((dimension.width - SCREEN_WITH)/2, (dimension.height - SCREEN_HEIGHT)/2, SCREEN_WITH, SCREEN_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//bam close chuong trinh se dong
        gamepanel = new GamePanel();
        add(gamepanel);
        
    }
    
    public void startGame(){
        gamepanel.StratGame();
    }
    
    public static void main(String[] args) {
        GameFrame start = new GameFrame();
        start.setVisible(true);//biull man hinh
        start.startGame();
    }
}
