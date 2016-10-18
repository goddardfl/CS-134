import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        checkForPizza();
        checkForKeyPress();
    }  
   
    public void pace(int steps)
    {
        walkLeft ( steps );
        walkRight ( steps * 2 );
        walkLeft ( steps );
    }
    
    public void jumpUpAndDown()
    {
        int jumpHeight = getImage().getHeight();
        setLocation ( getX(), getY() - jumpHeight );
        wait ( 10 );
        setLocation ( getX(), getY() + jumpHeight );
    }
    
    public void checkForPizza ()
    {
        if (isTouching (Pizza.class) )
        {
            removeTouching (Pizza.class) ;
            eat();
        }
    }
    public void checkForKeyPress()
    {
        if (Greenfoot.isKeyDown("left") )
        {
            walkLeft(2);
        }
        if (Greenfoot.isKeyDown("right") )
        {
            walkRight(2);
        }
        if (Greenfoot.isKeyDown("up") )
        {
            jumpUpAndDown();
        }
        if (Greenfoot.isKeyDown("down") )
        {
            orderOutForPizza();
        }
            
    }
    
    public void orderOutForPizza()
    {
        CatWorld world = (CatWorld)getWorld();
        world.addPizza();
    }
}
