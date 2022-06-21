package com.itp.userinterface;

import static com.itp.userinterface.GameFrame.SCREEN_HEIGHT;
import static com.itp.userinterface.GameFrame.SCREEN_WIDTH;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.EventListenerList;

public class Panel extends JPanel {

    protected EventListenerList listenerList = new EventListenerList();
    private JButton b;
    private ImageIcon background;
    public boolean open = false;
    private Menu menu;

    public Panel(Menu menu) {
        this.menu = menu;
        background = null;
        BoxLayout boxlayout = new BoxLayout(this, BoxLayout.X_AXIS);
        this.setLayout(new BorderLayout());
        // Tạo Border cho panel
        this.setBorder(new EmptyBorder(new Insets((SCREEN_HEIGHT - 60) / 2, (SCREEN_WIDTH - 60) / 2, (SCREEN_HEIGHT - 60) / 2, (SCREEN_WIDTH - 60) / 2)));
//        panel.setBorder(new EmptyBorder(new Insets(100,(SCREEN_WIDTH-30)/2,100,(SCREEN_WIDTH-30)/2)));
        b = new JButton("Srart");
        b.setSize(60, 60);
        Panel.ButtonHandler handler = new Panel.ButtonHandler();
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
