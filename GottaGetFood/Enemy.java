import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Actor
{
    public Enemy ()
    {
        turn (90);
    }
    public void act() 
    {
        move (5);
        if (isAtEdge() )
        {
            turn(180);
        }
        if (IsCollidingWithPlayer() )
        {
            getWorld().showText ( "Game Over, Press Enter to Restart", 300, 200);
            Greenfoot.stop();
        }
    }    
    public boolean IsCollidingWithPlayer()
    {
        Player collided = (Player) getOneIntersectingObject (Player.class);
        if (collided != null)
        {
            return true;
        }
        return false;
    }
}    
