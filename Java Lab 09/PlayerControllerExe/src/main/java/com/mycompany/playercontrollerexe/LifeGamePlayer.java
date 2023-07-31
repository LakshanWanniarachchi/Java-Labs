/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playercontrollerexe;

/**
 *
 * @author lakshitha
 */
public class LifeGamePlayer implements PlayerController  {
    
     @Override
    public void moveUp() {
        System.out.println("Player moves up.");
    }

    @Override
    public void moveDown() {
        System.out.println("Player moves down.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Player moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Player moves right.");
    }
    
}
