/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itp.gameobject;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Asus
 */
public class MegaMan {
    private float posX;
    private float postY;
    
    private float  width;
    private float  height;
    private float  mass;

    public float speedX;
    public float speedY;
    
    public static int DIR_LEFT;//loai huong trai
    public static int DIR_RIGHT;// loai huong phai
    public int direction; // huong cua chuyen dong
    
    public MegaMan(float posX, float postY, float width, float height, float mass) {
        this.posX = posX;
        this.postY = postY;
        this.width = width;
        this.height = height;
        this.mass = mass;
    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.red);
        g2.fillRect((int)posX, (int)postY, (int)width, (int)height);
    }
    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPostY() {
        return postY;
    }

    public void setPostY(float postY) {
        this.postY = postY;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getSpeedX() {
        return speedX;
    }

    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    
}
