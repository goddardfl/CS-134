import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Food extends Actor
{
    public Food ()
    {
        turn (90);
    }
    public void act() 
    {
        move (7);
        if (isAtEdge() )
        {
            turn(180);
        }
        if (IsCollidingWithPlayer() )
        {
            getWorld().removeObject(this);
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
