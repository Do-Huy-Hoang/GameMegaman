<<<<<<< Updated upstream

package com.itp.state;

import com.itp.effect.CacheDataLoader;
import com.itp.effect.FrameImage;
import com.itp.gameobject.BackgroundMap;
import com.itp.gameobject.BulletManager;
import com.itp.gameobject.Camera;
import com.itp.gameobject.MegaMan;
import com.itp.gameobject.ParticularObject;
import com.itp.gameobject.ParticularObjectManager;
import com.itp.gameobject.PhysicalMap;
import com.itp.userinterface.GameFrame;
import com.itp.userinterface.GamePanel;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;


public class GameWorldState extends State{
     private BufferedImage bufferedImage;
    private int lastState;

    public ParticularObjectManager particularObjectManager;
    public BulletManager bulletManager;

    public MegaMan megaMan;
   
    public PhysicalMap physicalMap;
    public BackgroundMap backgroundMap;
    public Camera camera;

    public static final int finalBossX = 3600;
    
    public static final int INIT_GAME = 0;
    public static final int TUTORIAL = 1;
    public static final int GAMEPLAY = 2;
    public static final int GAMEOVER = 3;
    public static final int GAMEWIN = 4;
    public static final int PAUSEGAME = 5;
    
    public static final int INTROGAME = 0;
    public static final int MEETFINALBOSS = 1;
    
    public int openIntroGameY = 0;
    public int state = INIT_GAME;
    public int previousState = state;
    public int tutorialState = INTROGAME;
    
    public int storyTutorial = 0;
    public String[] texts1 = new String[4];

    public String textTutorial;
    public int currentSize = 1;
    
    private boolean finalbossTrigger = true;
    ParticularObject boss;
    
    FrameImage avatar = CacheDataLoader.getInstance().getFrameImage("avatar");
    
    
    private int numberOfLife = 3;
    
    public AudioClip bgMusic;
    
    public GameWorldState(GamePanel gamePanel){
            super(gamePanel);
        
        texts1[0] = "We are heros, and our mission is protecting our Home\nEarth....";
        texts1[1] = "There was a Monster from University on Earth in 10 years\n"
                + "and we lived in the scare in that 10 years....";
        texts1[2] = "Now is the time for us, kill it and get freedom!....";
        texts1[3] = "      LET'S GO!.....";
        textTutorial = texts1[0];

        
        bufferedImage = new BufferedImage(GameFrame.SCREEN_WITH, GameFrame.SCREEN_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        megaMan = new MegaMan(400, 400, this);
        physicalMap = new PhysicalMap(0, 0, this);
        backgroundMap = new BackgroundMap(0, 0, this);
        camera = new Camera(0, 50, GameFrame.SCREEN_WIDTH, GameFrame.SCREEN_HEIGHT, this);
        bulletManager = new BulletManager(this);
        
        particularObjectManager = new ParticularObjectManager(this);
        particularObjectManager.addObject(megaMan);
        
        initEnemies();

        bgMusic = CacheDataLoader.getInstance().getSound("bgmusic");
        
    }

    @Override
    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Render() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BufferedImage getBufferedImage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setPressedButton(int code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setReleasedButton(int code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itp.state;

import com.itp.gameobject.BulletManager;
import com.itp.gameobject.MegaMan;
import com.itp.gameobject.ParticularObjectManager;
import com.itp.gameobject.PhysicalMap;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Asus
 */
public class GameWorldState{
      public MegaMan megaman ;
      public  PhysicalMap physicalMap;
      public  GameWordState(){
          megaman = new MegaMan(300,300,100,100,0.1f);
          physicalMap= new PhysicalMap(0, 0);
      }
      public  void ren(Graphics2D g2){
         
          physicalMap.draw(g2);
      }
      
      public  void up(Graphics2D g2){
           megaman.draw(g2);
      }
>>>>>>> Stashed changes
}
