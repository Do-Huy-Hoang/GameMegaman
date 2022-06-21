
package com.itp.userinterface;

<<<<<<< Updated upstream
import com.itp.state.GameWorldState;
import com.itp.state.State;
=======
import com.itp.gameobject.MegaMan;
import com.itp.gameobject.PhysicalMap;
import com.itp.state.GameWordState;
>>>>>>> Stashed changes
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

        

public class GamePanel extends JPanel implements Runnable, KeyListener{
<<<<<<< Updated upstream
    State gameState;

    InputManager inputManager;
    
    Thread gameThread;

    public boolean isRunning = true;

    public GamePanel(){

        //gameState = new MenuState(this);
        gameState = new GameWorldState(this);
        
        inputManager = new InputManager(gameState);

    }

    public void startGame(){
        gameThread = new Thread(this);
        gameThread.start();
=======
    private Thread thread;
    private boolean isRunning;
    private InputManager inputManager;
    private BufferedImage image;
    private BufferedImage subImage;
    private Graphics2D buf2D;
    private GameWordState gw;
    public GamePanel(){
//            inputManager = new InputManger();
//            try{
//                this.image = ImageIO.read(new File("data/megasprite.png"));
//                subImage = image.getSubimage(2, 5, 30, 100);
//            }catch(IOException ex){
//            }
     
        subImage = new BufferedImage(GameFrame.SCREEN_WITH, GameFrame.SCREEN_HEIGHT, BufferedImage.TYPE_INT_ARGB);
    }
    @Override
    public void paint(Graphics g){
//        g.setColor(Color.white);
//        g.fillRect(0, 0, GameFrame.SCREEN_WITH, GameFrame.SCREEN_HEIGHT);
        g.drawImage(subImage, 0, 0, this);
       
    };
    PhysicalMap physicalMap= new PhysicalMap(0, 0);
    
    public void RenderGame(){
        if (subImage == null) {
            subImage = new BufferedImage(GameFrame.SCREEN_WITH, GameFrame.SCREEN_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        }
        if(subImage!= null){
            buf2D =(Graphics2D) subImage.getGraphics();
        }
        if (buf2D != null) {
            buf2D.setColor(Color.white);
            buf2D.fillRect(0, 0, GameFrame.SCREEN_WITH, GameFrame.SCREEN_HEIGHT);
            
//            buf2D.setColor(Color.red);
//            buf2D.fillRect(40, 50, 100, 100);
            physicalMap.draw(buf2D);
        }
        
    }
    public void StratGame(){
        if (thread == null) {
            isRunning = true; //check xem game chay chua
            thread = new Thread(this);
            thread.start();
        }
>>>>>>> Stashed changes
    }
    int a = 0;
    @Override
<<<<<<< Updated upstream
    public void run() {

        long previousTime = System.nanoTime();
        long currentTime;
        long sleepTime;

        long period = 1000000000/80;

        while(isRunning){

            gameState.Update();
            gameState.Render();


            repaint();

            currentTime = System.nanoTime();
            sleepTime = period - (currentTime - previousTime);
            try{

                    if(sleepTime > 0)
                            Thread.sleep(sleepTime/1000000);
                    else Thread.sleep(period/2000000);

            }catch(Exception e){}

            previousTime = System.nanoTime();
=======
    public void run() {           
        long FTS = 60;
        long period = 1000*1000000/FTS;
        long beginTime;
        long sleppTime;
        
        
         RenderGame();    
         repaint();
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
>>>>>>> Stashed changes
        }

    }

    public void paint(Graphics g){

        g.drawImage(gameState.getBufferedImage(), 0, 0, this);

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        inputManager.setPressedButton(e.getKeyCode());
<<<<<<< Updated upstream
=======
        //khi nhan dung nut thi thuc hien lenh
>>>>>>> Stashed changes
    }

    @Override
    public void keyReleased(KeyEvent e) {
        inputManager.setReleasedButton(e.getKeyCode());
<<<<<<< Updated upstream
    }

    public void setState(State state) {
        gameState = state;
        inputManager.setState(state);
=======
>>>>>>> Stashed changes
    }
}

