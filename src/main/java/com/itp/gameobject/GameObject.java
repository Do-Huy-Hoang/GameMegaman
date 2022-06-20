/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itp.gameobject;

import com.itp.state.GameWordState;

/**
 *
 * @author Asus
 */
public abstract class GameObject {

	private float posX;
	private float posY;
	
	private GameWordState gameWorld;
	
	public GameObject(float x, float y, GameWordState gameWorld){
		posX = x;
		posY = y;
		this.gameWorld = gameWorld;
	}
	
	public void setPosX(float x){
		posX = x;
	}
	
	public float getPosX(){
		return posX;
	}
	
	public void setPosY(float y){
		posY = y;
	}
	
	public float getPosY(){
		return posY;
	}
	
	public GameWordState getGameWorld(){
		return gameWorld;
	}
	
	public abstract void Update();
	
}

