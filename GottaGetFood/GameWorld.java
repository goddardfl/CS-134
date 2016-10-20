import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
   
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject ( new Player (), 10 , 200);
        addObject ( new Food (), 500,200);
        addObject ( new Food (), 259,200);
        addObject ( new Food (), 100,200);
        addObject ( new Enemy (), 200,0);
        addObject ( new Enemy (), 320,260);
        addObject ( new Enemy (), 320,50);
        addObject ( new Enemy (), 320,300);
        addObject ( new Enemy (), 400,100);
        addObject ( new Enemy (), 400,300);
        addObject ( new Enemy (), 150 ,40);
        addObject ( new Enemy (), 150 ,240);
        addObject ( new Exit (), 41, 384);
        
    }
}
