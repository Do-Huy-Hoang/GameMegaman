
package com.itp.state;

import com.itp.control.Button;
import com.itp.control.RectangleButton;
import com.itp.userinterface.GameFrame;
import com.itp.userinterface.GamePanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;


public class MenuState extends State{
    //khai bao so nut
    public final int NUMBER_OF_BUTTON = 2;
    private  BufferedImage bufferedImage;
    Graphics graphics;
    
    private Button[] buttons;
        private int selectedButton = 0;
        private boolean canContinueGame = false;

    public MenuState(GamePanel gamePanel){
        super(gamePanel);
        //khai bao ham lay hinh anh co chieu rong dai bang voi cua so
        bufferedImage = new BufferedImage(GameFrame.SCREEN_WITH,GameFrame.SCREEN_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        //khia bao 1 object moi co so phan tu mang
        buttons = new Button[NUMBER_OF_BUTTON];
        buttons[0]= new RectangleButton("New game",300,100,100,40,15,25, Color.ORANGE);
        buttons[0].setHoverBgColor(Color.BLUE);
        buttons[0].setPressedBgColor(Color.GREEN);
        
        buttons[1] = new RectangleButton("Exit",300,100,100,40,15,25, Color.ORANGE);
        buttons[1].setHoverBgColor(Color.BLUE);
        buttons[1].setPressedBgColor(Color.GREEN);
    }
        
    @Override
    public void Update() {
        for (int i = 0; i <NUMBER_OF_BUTTON; i++) {
            if (i == selectedButton) {
                buttons[i].setState(Button.HOVER);
            }else{
                buttons[i].setState(Button.NONE);
            }
        }
    }

    @Override
    public void Render() {
        if (bufferedImage == null) {
            bufferedImage = new BufferedImage(GameFrame.SCREEN_WITH, GameFrame.SCREEN_HEIGHT, BufferedImage.TYPE_INT_ARGB);
            return;
        }
        graphics = bufferedImage.getGraphics();
        if (graphics == null) {
            graphics = bufferedImage.getGraphics();
            return;
        }
        graphics.setColor(Color.CYAN);
        graphics.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
        for (Button button : buttons) {
            button.draw(graphics);
        }
    }

    @Override
    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    @Override
    public void setPressedButton(int code) {
        switch (code) {
            case KeyEvent.VK_UP:
                selectedButton++;
                if (selectedButton  >= NUMBER_OF_BUTTON) {
                    selectedButton =0;
                }
                break;
            case KeyEvent.VK_DOWN:
                selectedButton--;
                if (selectedButton < 0) {
                    selectedButton = NUMBER_OF_BUTTON - 1;
                }      
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void setReleasedButton(int code) {
        
    }
    
//    private void actionMenu(){
//        switch (selectedButton) {
//            case 0:
//                gamePanel.setState(new GameWordState(gamePanel));
//                break;
//            case 1:
//                System.exit(0);
//                break;
//            default:
//                throw new AssertionError();
//        }
//    }
    
}
