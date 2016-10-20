import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MenuWorld extends World
{
    
    public void gotoGame()
    {
        GameWorld nextState = new GameWorld();
        Greenfoot.setWorld( nextState );
    }
    public MenuWorld()
    {    
        super(600, 400, 1); 
        addObject (new TitleStuff(), 289 , 213);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new GameWorld());
        }
    }
}
