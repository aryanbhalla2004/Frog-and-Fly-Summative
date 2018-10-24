import greenfoot.*;  // (Wo rld, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    //Speed is the a vauable 
    private int speed;
    
    /**
     * Frog is the contructor that sets the speed between 4 to 8 for the frog 
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public Frog()
    {        
        speed = Greenfoot.getRandomNumber(4) + 4;
    }
    
    /**
     * act is the contructor that make the frog Object
     * move setting up the speed for the frog
     * isAtEdge is make frog turn if the frog hits the edge
     * eatFly is making the frog eat the fly if the fly is near or under the frog
     * frogPath is making the from move random location
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void act() 
    {
        move(speed);
        
        frogPath();
        
       
        if(isAtEdge() == true)
         {
             turn(7);
         }
         
        
        eatFly();
        
        
    }  
    
    /**
     * eatFly is making the frog eat the fly by hovering over it or chasing it...
     * and stoping the Greenfoot
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void eatFly()
    {
        if(isTouching(Fly.class))
        {
            removeTouching(Fly.class);
            Greenfoot.stop();
        }
    }
    
    /**
     * frogPath is making the frog go in random places like if the 35% of the time frog turn left 15 diagres...
     * and right 15 digares and the other precent of the time frog move straight
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void frogPath()
    {
       if(Greenfoot.getRandomNumber(100) < 35)
       {
      
           turn(15);
       }
       else
       {
           turn(-15);
       }
    }
}
