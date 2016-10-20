import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ControledMoveableObjects extends Actor
{
    protected int speed;
    void moveLeft()
    {
        setLocation( getX() - speed, getY() );
    }
    void moveRight()
    {
        setLocation( getX() + speed, getY() );
    }
    void moveUp()
    {
        setLocation( getX(), getY() - speed );
    }
    void moveDown()
    {
        setLocation( getX(), getY() + speed );
    }
 }
