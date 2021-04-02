import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rivets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class rivets.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject (new Robot(), 35, 50);
        addObject (new Wall(), 750, 200);
        addObject (new Wall(), 650, 200);
        addObject (new Wall(), 0, 200);
        addObject (new Wall(), 100, 200);
        addObject (new Wall(), 200, 200);
        addObject (new Wall(), 300, 200);
        addObject (new Wall(), 350, 200);
        addObject (new Block(), 500, 200);
        addObject (new Pizza(), 500, 300);
        addObject (new Pizza(), 500, 350);
        addObject (new Pizza(), 500, 400);
        addObject (new Pizza(), 500, 450);
        addObject (new Pizza(), 500, 500);
        addObject (new Home(), 500, 550);
    }
}
