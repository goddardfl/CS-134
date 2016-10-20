import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Exit extends Actor
{
   
    public void act() 
    {
      if (Greenfoot.mouseClicked(this))
        {
            getWorld().showText ( "Game Over", 300, 200);
            Greenfoot.stop();
        }  
    }    
}
