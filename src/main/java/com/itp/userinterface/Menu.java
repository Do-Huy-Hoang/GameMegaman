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
//       this.setBackground(new ImageIcon("data/wallpaper-mania.com_High_resolution_wallpaper_background_ID_77700862162.jpg"));
        this.setVisible(true);

        Menu menu = this;
        class panel extends JPanel {

            protected EventListenerList listenerList = new EventListenerList();
            private JButton b;
            private ImageIcon background;
            public boolean open = false;

            public panel() {
                background = null;
                BoxLayout boxlayout = new BoxLayout(this, BoxLayout.X_AXIS);
                this.setLayout(new BorderLayout());
                // Tạo Border cho panel
                this.setBorder(new EmptyBorder(new Insets((SCREEN_HEIGHT - 60) / 2, (SCREEN_WIDTH - 60) / 2, (SCREEN_HEIGHT - 60) / 2, (SCREEN_WIDTH - 60) / 2)));
//        panel.setBorder(new EmptyBorder(new Insets(100,(SCREEN_WIDTH-30)/2,100,(SCREEN_WIDTH-30)/2)));
                b = new JButton("Srart");
                b.setSize(60, 60);
                panel.ButtonHandler handler = new panel.ButtonHandler();
                b.addActionListener(handler);
                this.add(b, BorderLayout.CENTER);
            }

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (background != null) {
                    g.drawImage(background.getImage(),
                            0, 0, getWidth(), getHeight(), null);
                }
            }

            public void setBackground(ImageIcon img) {
                this.background = img;
            }

            public void addActionListener(ActionListener l) {
                listenerList.add(ActionListener.class, l);
            }

            private class ButtonHandler implements ActionListener {

                @Override
                public void actionPerformed(ActionEvent event) {
                    if (event.getSource() == b) {
                        try {
                            open = true;
                            GameFrame game = new GameFrame();
                            game.startGame();
                            game.setVisible(true);
                            menu.disable();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }
        panel a = new panel();
        // Tạo Boxlayout với hằng số X_AXIS
        a.setBackground(new ImageIcon("data/wallpaper-mania.com_High_resolution_wallpaper_background_ID_77700862078.jpg"));
        //b.addActionListener();
        this.add(a);
    }

    public static void main(String arg[]) {

        Menu gameFrame = new Menu();
    }

}
