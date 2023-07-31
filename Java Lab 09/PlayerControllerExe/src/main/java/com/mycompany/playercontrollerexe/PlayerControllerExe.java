/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.playercontrollerexe;

/**
 *
 * @author lakshitha
 */
public class PlayerControllerExe {

    public static void main(String[] args) {
        
       PlayerController player = new LifeGamePlayer();

        // Simulate key presses
        player.moveUp();
        player.moveLeft();
        player.moveDown();
        player.moveRight();
    }
}
