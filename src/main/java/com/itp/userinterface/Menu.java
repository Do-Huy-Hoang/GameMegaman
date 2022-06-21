package com.itp.userinterface;

import static com.itp.userinterface.GameFrame.SCREEN_HEIGHT;
import static com.itp.userinterface.GameFrame.SCREEN_WIDTH;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.EventListenerList;

public class Menu extends JFrame {

    JPanel jpanel;

    public Menu() {

        super("Mega Man java game");
        Toolkit toolkit = this.getToolkit();
        Dimension solution = toolkit.getScreenSize();
        this.setBounds((solution.width - SCREEN_WIDTH) / 2, (solution.height - SCREEN_HEIGHT) / 2, SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
        setContentPane(jpanel);
        this.setBackground(Color.WHITE);
        
        String bak = "data/wallpaper-mania.com_High_resolution_wallpaper_background_ID_77700862078.jpg";
        
        Panel a = new Panel(this);
        // Tạo Boxlayout với hằng số X_AXIS
        a.setBackground(new ImageIcon(bak));
        //b.addActionListener();
        this.add(a);
        this.setVisible(true);
    }

    public static void main(String arg[]) {

        Menu gameFrame = new Menu();
    }

}
