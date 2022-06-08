/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itp.effect;

import java.util.ArrayList;

/**
 *
 * @author Asussadasdasdasdsdasd
 */
public class Animation {
    private String name;
    private boolean isRepeated;
    private ArrayList<FrameImage> frameImages;
    private int currentFrame;
    private ArrayList<Boolean> ignoreFrames;
    private ArrayList<Double> delayFrames;
    private long beginTime;
    private boolean drawRectFrame;

    public Animation() {
       delayFrames = new ArrayList<Double>();
       beginTime = 0;
       currentImage = 0;
       ignoreFrames = new ArrayList<Boolean>();
       frameImages = new ArrayList<FrameImage>();
       drawRectFrame = false;
       isRepeated = true;
       
    }
    
    public Animation(Animation animation){
        beginTime = animation.beginTime;
        currentFrame = animation.currentFrame;
        isRepeated = animation.isRepeated;
        drawRectFrame = animation.drawRectFrame;
        
        delayFrames = new ArrayList<Double>();
        for(double i = 0;i<animation.delayFrames.size();i++){
            delayFrames.add(i);
        }
        
        ignoreFrames = new ArrayList<Boolean>();
        for(boolean i:animation.ignoreFrames){
            ignoreFrames.add(i);
        }
    }
    
    
    
}
