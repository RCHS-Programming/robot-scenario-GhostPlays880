import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Movement();
        detectBlockCollision();
        detectWallCollision();
        detectHome();
    }    
    public void Movement()
    {
        if(Greenfoot.isKeyDown ("up"))
        {
            setLocation( getX(), getY() -3);
        }
        if(Greenfoot.isKeyDown ("down"))
        {
            setLocation( getX(), getY() +3);
        }
         if(Greenfoot.isKeyDown ("left"))
        {
            setLocation( getX() -3, getY() );
        }
         if(Greenfoot.isKeyDown ("right"))
        {
            setLocation( getX() +3, getY() );
        }
    
    }
    public void detectBlockCollision()
    {
       if (isTouching(Pizza.class))
       {
           Greenfoot.playSound("eat.wav");
           removeTouching(Pizza.class);
       }
    }
    public void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(50, 35);
        }
    }
    public void detectHome()
    {
        if (isTouching(Home.class))
        {
           setLocation(50, 35); 
           Greenfoot.playSound("yipee.wav");
        }
    }
}
