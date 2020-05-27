/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sig.training.ch05.boardpanel;

/**
 *
 * @author lk
 */
public class Rectangle {
    private final Point position;
    private final int width;
    private final int height;
    
    public Rectangle(Point position, int width, int height){
        this.position = position;
        this.width = width;
        this.height = height;
    }
    
    public Point getPosition(){
        return position;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
}
