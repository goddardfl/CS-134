import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends ControledMoveableObjects
{
    
    int speed;
    public Player()
    {
        speed = 8;
    }
    public void act() 
    {
        int x = getX();
        int y = getY();

        if ( Greenfoot.isKeyDown( "left" ) )
        {
            x -= speed;
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            x += speed;
        }
        if ( Greenfoot.isKeyDown( "up" ) )
        {
            y -= speed;
        }
        else if ( Greenfoot.isKeyDown( "down" ) )
        {
            y += speed;
        }
        setLocation( x, y );
         if (getWorld().getObjects(Food.class).isEmpty())
        {
            getWorld().showText ( "YOU FINALLY DID IT!! XD", 300, 200);
            Greenfoot.stop();
        }
    }    
}
